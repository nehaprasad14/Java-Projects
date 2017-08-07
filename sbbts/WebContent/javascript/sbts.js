// $(document).ready();
// console.log("LOG::");

$(document).ready(function()
{
	console.log("SOME::LOG::DURING::LOAD");
	
	var chap=null,topic=null,subtopic=null , section = null;
	
	
	
	
	// USAGE OF UI
	$('#fname').datepicker();
	$(document).tooltip();
	
	$( "#menu" ).menu();
	
	$('#header').click(function(){
		console.log("AAP::MSG::PRINT");
		
		$('#mainbody').toggle();
	});
	 $(function() 
				{
			 $( "#accordion" ).accordion();
			 });
	
	//===================================================================
	$('li.sub_topic').click(
	function(){
		
		
		
		//child element...subtopic
		subtopic=$(this).children("div").attr("id");
		console.log("child.........."+subtopic);
		
		//parent element ...topic
		 topic=$(this).parent().parent().children("div").attr("id");
		console.log("parent.........."+topic);
		
		//chapter id
		 chap=$(this).parent().parent().parent().parent().children("div").attr("id");
		console.log("parent ka parent...."+chap);
	
					
			//console.log("yehhhhh"+subtopic);
			
					var xmlhttp;
					var chname,i=0,j=0;
					if (window.XMLHttpRequest)
					{
					xmlhttp=new XMLHttpRequest();
					}
					else
					{
					xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
					}
					
					
										
					if(chap=="CH01")
						 chname="../xml/SORTING_TECHNIQUES.xml";
					else if(chap=="CH02")
						chname="../xml/SEARCHING_TECHNIQUES.xml";
					else
						chname="error";
						
					
					xmlhttp.open("GET",chname,false);
					xmlhttp.send();
					xmlDoc=xmlhttp.responseXML; 
					
					x=xmlDoc.getElementsByTagName("TOPIC");
					
					if(subtopic=="S101")
					{
						i=0;
						j=0;
					}
					else if(subtopic=="S102")
					{
						i=0;
						j=1;
					}
					else if(subtopic=="S103")
					{
						i=1;
						j=0;
					}
					else if(subtopic=="S104")
					{
						i=1;
						j=1;
					}
					else if(subtopic=="S201")
					{
						i=0;
						j=0;
					}
					else if(subtopic=="S202")
					{
						i=0;
						j=1;
					}
					else
					{}
					
					
					var opt1=x[i].getElementsByTagName("SUB_TOPIC")[j].getElementsByTagName("INTRO")[0].childNodes[0].nodeValue;
					var opt2=x[i].getElementsByTagName("SUB_TOPIC")[j].getElementsByTagName("DEFINITION")[0].childNodes[0].nodeValue;
					var opt3=x[i].getElementsByTagName("SUB_TOPIC")[j].getElementsByTagName("EXAMPLE")[0].childNodes[0].nodeValue;
					var opt4=x[i].getElementsByTagName("SUB_TOPIC")[j].getElementsByTagName("SUMMARY")[0].childNodes[0].nodeValue;
					var opt5=x[i].getElementsByTagName("SUB_TOPIC")[j].getElementsByTagName("ASSIGNMENT")[0].childNodes[0].nodeValue;
					var opt6=x[i].getElementsByTagName("SUB_TOPIC")[j].getElementsByTagName("PIC")[0].childNodes[0].nodeValue;
					var opt7=x[i].getElementsByTagName("SUB_TOPIC")[j].getElementsByTagName("AUDIO")[0].childNodes[0].nodeValue;
					var opt8=x[i].getElementsByTagName("SUB_TOPIC")[j].getElementsByTagName("VIDEO")[0].childNodes[0].nodeValue;
					
					$("#intro1 p").remove();
					$("#def1 p").remove();
					$("#ex1 p").remove();
					$("#summary1 p").remove();
					$("#assign1 p").remove();
					$("#img11 p ").remove();
					$("#img11 img").remove();
					$("#audio1 p").remove();
					$("#video1 p").remove();
					
					$("#intro1 ").append("<p class='"+subtopic+"'>"+opt1+"</p>");
					$("#def1 ").append("<p class='"+subtopic+"'>"+opt2+"</p>");
					$("#ex1 ").append("<p class='"+subtopic+"'>"+opt3+"</p>");
					$("#summary1 ").append("<p class='"+subtopic+"'>"+opt4+"</p>");
					$("#assign1 ").append("<p class='"+subtopic+"'>"+opt5+"</p>");
					$("#img11").append("<img class='"+subtopic+"' src=\"images/"+opt6+" \" width=\"458\" height=\"308\" >");
					$("#audio1 ").append("<p class='"+subtopic+"'>"+opt7+"</p>");
					$("#video1 ").append("<p class='"+subtopic+"'>"+opt8+"</p>");
					
					var l = "p."+subtopic;
					$('h3 div').attr('class',subtopic);
					var m = "div."+subtopic;
					console.log("l:"+l);
					console.log("m:"+m);
					var lastClick = 0;
					$(m).click(
							function(event){
								section = $(this).attr("id");
								console.log(subtopic);
								console.log(topic);
								console.log(chap);
								console.log(section);
									$.ajax({
									  
										url: "Example.action",
									    type: "POST",
									    
									    data: {"dl.chapter":chap,"dl.topic":topic,"dl.subtopic":subtopic,"dl.section":section,"dl.lastClick":lastClick,"dl.chapter":chap},
										 
									    
									    success: function(data)
									    {         
									    	
									        alert('SUCCESS');
									        alert(data);
									    }
								});
				
							});
	});
});
		
