$(document).ready(function()
{
	

	
	//Global variables for tracking no of clicks on every id.
	var s101 = 0;
	var intro = def = ex = summary = assign = img1 = audio = video = 0;
	
	
	
		
	
	
	
	
	$("#timeSpent").click(
			
		function(event)
		{
		
		
		if(id1 == "#intro" || id1 == "#intro1")
		{
			intro++;
			console.log("number of times intro is clicked" + intro);
		}
		if(id == "#def")
		{
			def++;
		}
		if(id == "#ex")
		{
			ex++;
		}
		if(id == "#summary")
		{
			summary++;
		}
		if(id == "#assgin")
		{
			assign++;
		}
		if(id == "#img1")
		{
			img1++;
		}
		if(id == "#audio")
		{
			audio++;
		}
		if(id == "#video")
		{
			video++;
		}
	}	
		
	
);
	
	
	$("#treeMenu li").toggle(			
			
			  function() { // START FIRST CLICK FUNCTION
				  $(this).children('ul').slideDown();
				  if ($(this).hasClass('contentContainer')) {   
					  $(this).removeClass('contentContainer').addClass('contentViewing');
				  }
			  }, // END FIRST CLICK FUNCTION
			  
			  function() { // START SECOND CLICK FUNCTION
				  $(this).children('ul').slideUp();

				  if ($(this).hasClass('contentViewing')) {
					  $(this).removeClass('contentViewing').addClass('contentContainer');
				  }
					} // END SECOND CLICK FUNCTIOn
				); // END TOGGLE FUNCTION 
	
	

	$("#S101").click(function()
	{
		var xmlhttp;
		if (window.XMLHttpRequest)
		{
		xmlhttp=new XMLHttpRequest();
		}
		else
		{
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.open("GET","../xml/SORTING_TECHNIQUES.xml",false);
		xmlhttp.send();
		xmlDoc=xmlhttp.responseXML; 
		x=xmlDoc.getElementsByTagName("TOPIC");
		
		var opt1=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
		var opt2=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
		var opt3=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
		var opt4=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
		var opt5=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
		var opt6=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
		var opt7=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
		var opt8=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
		$("#intro p").remove();
		$("#def p").remove();
		$("#ex p").remove();
		$("#summary p").remove();
		$("#assign p").remove();
		$("#img1 p ").remove();
		$("#img1 img").remove();
		$("#audio p").remove();
		$("#video p").remove();
		
		$("#intro ").append("<p>"+opt1+"</p>");
		$("#def ").append("<p>"+opt2+"</p>");
		$("#ex ").append("<p>"+opt3+"</p>");
		$("#summary ").append("<p>"+opt4+"</p>");
		$("#assign ").append("<p>"+opt5+"</p>");
		
		$("#img1").append("<img src=\"../images/"+opt6+" \" width=\"458\" height=\"308\" >");
		$("#audio ").append("<p>"+opt7+"</p>");
		$("#video ").append("<p>"+opt8+"</p>");
			
		++s101;
		console.log("insertion sort was clicked these many times : "+s101);
	
	
	
	});
	
	
	
	$("#S102").click(function()
			{
				var xmlhttp;
				if (window.XMLHttpRequest)
				{
				xmlhttp=new XMLHttpRequest();
				}
				else
				{
				xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				}
				xmlhttp.open("GET","../xml/SORTING_TECHNIQUES.xml",false);
				xmlhttp.send();
				xmlDoc=xmlhttp.responseXML; 
				x=xmlDoc.getElementsByTagName("TOPIC");
				
				var opt1=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
				var opt2=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
				var opt3=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
				var opt4=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
				var opt5=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
				var opt6=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
				var opt7=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
				var opt8=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
				
				$("#intro p").remove();
				$("#def p").remove();
				$("#ex p").remove();
				$("#summary p").remove();
				$("#assign p").remove();
				$("#img1 p ").remove();
				$("#img1 img").remove();
				$("#audio p").remove();
				$("#video p").remove();
				
				$("#intro ").append("<p>"+opt1+"</p>");
				$("#def ").append("<p>"+opt2+"</p>");
				$("#ex ").append("<p>"+opt3+"</p>");
				$("#summary ").append("<p>"+opt4+"</p>");
				$("#assign ").append("<p>"+opt5+"</p>");
				$("#img1").append("<img src=\"../images/"+opt6+" \" width=\"458\" height=\"308\" >");
				$("#audio ").append("<p>"+opt7+"</p>");
				$("#video ").append("<p>"+opt8+"</p>");
					 
					});
	
	$("#S103").click(function()
			{
				var xmlhttp;
				if (window.XMLHttpRequest)
				{
				xmlhttp=new XMLHttpRequest();
				}
				else
				{
				xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				}
				xmlhttp.open("GET","../xml/SORTING_TECHNIQUES.xml",false);
				xmlhttp.send();
				xmlDoc=xmlhttp.responseXML; 
				x=xmlDoc.getElementsByTagName("TOPIC");
				
				var opt1=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
				var opt2=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
				var opt3=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
				var opt4=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
				var opt5=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
				var opt6=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
				var opt7=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
				var opt8=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
				$("#intro p").remove();
				$("#def p").remove();
				$("#ex p").remove();
				$("#summary p").remove();
				$("#assign p").remove();
				$("#img1 p").remove();
				$("#img1 img").remove();
				$("#audio p").remove();
				$("#video p").remove();
				
				$("#intro ").append("<p>"+opt1+"</p>");
				$("#def ").append("<p>"+opt2+"</p>");
				$("#ex ").append("<p>"+opt3+"</p>");
				$("#summary ").append("<p>"+opt4+"</p>");
				$("#assign ").append("<p>"+opt5+"</p>");
				$("#img1").append("<img src=\"../images/"+opt6+" \" width=\"458\" height=\"308\" >");
				$("#audio ").append("<p>"+opt7+"</p>");
				$("#video ").append("<p>"+opt8+"</p>");
					});
	
	$("#S104").click(function()
			{
				var xmlhttp;
				if (window.XMLHttpRequest)
				{
				xmlhttp=new XMLHttpRequest();
				}
				else
				{
				xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				}
				xmlhttp.open("GET","../xml/SORTING_TECHNIQUES.xml",false);
				xmlhttp.send();
				xmlDoc=xmlhttp.responseXML; 
				x=xmlDoc.getElementsByTagName("TOPIC");
				
				var opt1=x[1].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
				var opt2=x[1].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
				var opt3=x[1].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
				var opt4=x[1].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
				var opt5=x[1].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
				var opt6=x[1].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
				var opt7=x[1].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
				var opt8=x[1].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
				$("#intro p").remove();
				$("#def p").remove();
				$("#ex p").remove();
				$("#summary p").remove();
				$("#assign p").remove();
				$("#img1 p").remove();
				$("#img1 img").remove();
				$("#audio p").remove();
				$("#video p").remove();
				
				$("#intro ").append("<p>"+opt1+"</p>");
				$("#def ").append("<p>"+opt2+"</p>");
				$("#ex ").append("<p>"+opt3+"</p>");
				$("#summary ").append("<p>"+opt4+"</p>");
				$("#assign ").append("<p>"+opt5+"</p>");
				$("#img1").append("<img src=\"../images/"+opt6+" \" width=\"458\" height=\"308\" >");
				$("#audio ").append("<p>"+opt7+"</p>");
				$("#video ").append("<p>"+opt8+"</p>");
					});
	
	$("#S105").click(function()
			{
				var xmlhttp;
				if (window.XMLHttpRequest)
				{
				xmlhttp=new XMLHttpRequest();
				}
				else
				{
				xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				}
				xmlhttp.open("GET","../xml/SORTING_TECHNIQUES.xml",false);
				xmlhttp.send();
				xmlDoc=xmlhttp.responseXML; 
				x=xmlDoc.getElementsByTagName("TOPIC");
				
				var opt1=x[1].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
				var opt2=x[1].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
				var opt3=x[1].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
				var opt4=x[1].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
				var opt5=x[1].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
				var opt6=x[1].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
				var opt7=x[1].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
				var opt8=x[1].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
				$("#intro p").remove();
				$("#def p").remove();
				$("#ex p").remove();
				$("#summary p").remove();
				$("#assign p").remove();
				$("#img1 p").remove();
				$("#img1 img").remove();
				$("#audio p").remove();
				$("#video p").remove();
				
				$("#intro ").append("<p>"+opt1+"</p>");
				$("#def ").append("<p>"+opt2+"</p>");
				$("#ex ").append("<p>"+opt3+"</p>");
				$("#summary ").append("<p>"+opt4+"</p>");
				$("#assign ").append("<p>"+opt5+"</p>");
				$("#img1").append("<img src=\"../images/"+opt6+" \" width=\"458\" height=\"308\" >");
				$("#audio ").append("<p>"+opt7+"</p>");
				$("#video ").append("<p>"+opt8+"</p>");
					});
	
	$("#S201").click(function()
			{
				var xmlhttp;
				if (window.XMLHttpRequest)
				{
				xmlhttp=new XMLHttpRequest();
				}
				else
				{
				xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				}
				xmlhttp.open("GET","../xml/SEARCHING_TECHNIQUES.xml",false);
				xmlhttp.send();
				xmlDoc=xmlhttp.responseXML; 
				x=xmlDoc.getElementsByTagName("TOPIC");
				
				var opt1=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
				var opt2=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
				var opt3=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
				var opt4=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
				var opt5=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
				var opt6=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
				var opt7=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
				var opt8=x[0].getElementsByTagName("SUB_TOPIC")[0].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
				$("#intro p").remove();
				$("#def p").remove();
				$("#ex p").remove();
				$("#summary p").remove();
				$("#assign p").remove();
				$("#img1 p").remove();
				$("#img1 img").remove();
				$("#audio p").remove();
				$("#video p").remove();
				
				$("#intro ").append("<p>"+opt1+"</p>");
				$("#def ").append("<p>"+opt2+"</p>");
				$("#ex ").append("<p>"+opt3+"</p>");
				$("#summary ").append("<p>"+opt4+"</p>");
				$("#assign ").append("<p>"+opt5+"</p>");
				$("#img1").append("<img src=\"../images/"+opt6+" \" width=\"458\" height=\"308\" >");
				$("#audio ").append("<p>"+opt7+"</p>");
				$("#video ").append("<p>"+opt8+"</p>");
					});
	
	$("#S202").click(function()
			{
				var xmlhttp;
				if (window.XMLHttpRequest)
				{
				xmlhttp=new XMLHttpRequest();
				}
				else
				{
				xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				}
				xmlhttp.open("GET","../xml/SEARCHING_TECHNIQUES.xml",false);
				xmlhttp.send();
				xmlDoc=xmlhttp.responseXML; 
				x=xmlDoc.getElementsByTagName("TOPIC");
				
				var opt1=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
				var opt2=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
				var opt3=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
				var opt4=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
				var opt5=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
				var opt6=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
				var opt7=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
				var opt8=x[0].getElementsByTagName("SUB_TOPIC")[1].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
				
				$("#intro p").remove();
				$("#def p").remove();
				$("#ex p").remove();
				$("#summary p").remove();
				$("#assign p").remove();
				$("#img1 p").remove();
				$("#img1 img").remove();
				$("#audio p").remove();
				$("#video p").remove();
				
				$("#intro ").append("<p>"+opt1+"</p>");
				$("#def ").append("<p>"+opt2+"</p>");
				$("#ex ").append("<p>"+opt3+"</p>");
				$("#summary ").append("<p>"+opt4+"</p>");
				$("#assign ").append("<p>"+opt5+"</p>");
				$("#img1").append("<img src=\"../images/"+opt6+" \" width=\"458\" height=\"308\" >");
				$("#audio ").append("<p>"+opt7+"</p>");
				$("#video ").append("<p>"+opt8+"</p>");
					 
					});
	
	$("#S203").click(function()
			{
				var xmlhttp;
				if (window.XMLHttpRequest)
				{
				xmlhttp=new XMLHttpRequest();
				}
				else
				{
				xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				}
				xmlhttp.open("GET","../xml/SEARCHING_TECHNIQUES.xml",false);
				xmlhttp.send();
				xmlDoc=xmlhttp.responseXML; 
				x=xmlDoc.getElementsByTagName("TOPIC");
				
				var opt1=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
				var opt2=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
				var opt3=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
				var opt4=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
				var opt5=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
				var opt6=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
				var opt7=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
				var opt8=x[0].getElementsByTagName("SUB_TOPIC")[2].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
				
				$("#intro p").remove();
				$("#def p").remove();
				$("#ex p").remove();
				$("#summary p").remove();
				$("#assign p").remove();
				$("#img1 p").remove();
				$("#img1 img").remove();
				$("#audio p").remove();
				$("#video p").remove();
				
				$("#intro ").append("<p>"+opt1+"</p>");
				$("#def ").append("<p>"+opt2+"</p>");
				$("#ex ").append("<p>"+opt3+"</p>");
				$("#summary ").append("<p>"+opt4+"</p>");
				$("#assign ").append("<p>"+opt5+"</p>");
				$("#img1").append("<img src=\"../images/"+opt6+" \" width=\"458\" height=\"308\" >");
				$("#audio ").append("<p>"+opt7+"</p>");
				$("#video ").append("<p>"+opt8+"</p>");
					 
					});
	 
});