package sorteio;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@WebServlet(value = "sorteio")
public class Sessao extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(
		      HttpServletRequest req,
		      HttpServletResponse resp)
		      throws ServletException, IOException {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 Random r = new Random();
         String resposta= null;
         int size = 0;
       		    //Referência para a sessão.
		    HttpSession sessao = req.getSession();
		    
		    String acao = req.getParameter("acao");
		    ArrayList l = (ArrayList) sessao.getAttribute("lista");
		    size = l.size();
		    
		    if(acao.equals("Sortear")&&size<10){
				 int valor = r.nextInt()*10;
				
		    	if(sessao.getAttribute("lista") == null){
		    		list.add(valor);
			    	sessao.setAttribute("lista", list);
			    }
		    	
		    	if(sessao.getAttribute("lista")!=null){
		    	for(int i=0;i<list.size();i++){
		    		if(valor == (Integer)list.get(i)){
		    			valor = r.nextInt();
		    		}
		    	}
		    	  resposta = Integer.toString(valor);
		    	  list.add(valor); 
		    	  sessao.setAttribute("lista", list);
		    	} 
			    
		    }else if(acao.equals("Reiniciar")){
                          sessao.invalidate();
		    }else if(size==10){
		    	resposta = "Já foram inseridos 10 numeros";
		    }
		    req.setAttribute("valor", resposta);
		    
		    req.getRequestDispatcher("sorteio/sorteio.jsp").forward(req, resp);   
	 }	
	
}