<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:include page="Header.jsp" />
    
    
    
    
    <section class="descripciones">
    <!--Se us� el mismo template que utilic� para las descripciones de los libros. Recuerdenme si necesitan m�s detalles o si no les gusta como qued�-->


	   <div  id="perfil" class="container">
	  	<div class="row">
	  	<div class="col-md-4">
		    <div class="polaroid">
	  			<img src="https://i.pinimg.com/originals/f4/b7/c4/f4b7c44863b0e6cc3b273481cd7bf284.jpg" alt="5 Terre" style="width:100%; opacity:0.5">
	  			<div class="desc">
	  				<p>Mira, tu consciencia se est� yendo, �Deber�as leer m�s para no quedar igual de flaite como esta imagen!</p>
	  			</div>
	  		</div>
		</div>
	    
	    <div class="col-md-8">
	    	 <h3>Jhon Doe</h3>
	    	 <p class="genero">Libros Le�dos: 0 <br> Felicitaciones inculto de mierda, puedes iniciar tu recorrido por la literatura con nosotros!</p><!-- No borrar que puede que lo necesite despu�s -->
	   	 <h5>Biograf�a</h5>
	   	 <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labor</p>
	        	<br>Edad:33 a�os 
	       	    <br>G�nero preferido: hentai
	       	    <br>Inicio Subscripci�n:10 a�os 
	      	    <br>Libros que has rankeado: Secreto en la monta�a, las mota�as de la locura.    
	    </div>
	  	</div> 
	  </div>
	 </section>
	    
    
    <section class="intermedio">
	    <div class="container-fluid">
	      <div class="row align-item-center justify-content-center">
	        <div class="col-md-10">
	          <h1>�Quieres saber que pasar�a si se pintara la tierra completa de blanco? Nosotros no <br> �Pero te dejamos un video por las dudas!</h1>
	          <p> Y lo peor de todo, es que nos la craneamos para esto.</p>
	        </div>
	      </div>
	    </div>
	</section>
    
    
    <section class="videos">
    <div class="container-fluid">
    <div class="row align-items-center justify-content-center">
   
    <div class="col-md-8" style="width: 100%; height: auto; margin-bottom: 50px">
    <iframe width="853" height="480" src="https://www.youtube.com/embed/SPbkBTvEhII" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>
    
    <div class="col-md-2" style="width: 100%; height: auto; margin-bottom: 50px">
    <h1> Te intentaremos traer mas videos como este, tambi�n seminarios o presentaciones de libros �Personalizados solo para ti!</h1>
    </div>
    </div>
    </section>
    
    <section class="intermedio">
	    <div class="container-fluid">
	      <div class="row align-item-center justify-content-center">
	        <div class="col-md-10">
	          <h1>�Quieres cambiar el tema de tu perfil?<br><button class="btn btn-sm btn-outline-success">�Hazlo aqu�!</button> </h1>
	          <p> Y lo peor de todo, es que nos la craneamos para esto.</p>
	        </div>
	      </div>
	    </div>
	</section>
    
    
    
    <jsp:include page="Footer.jsp"/>
 
  </html>
