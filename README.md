# Book My Show

## Table of contents

1. ###### [Technology Used](https://github.com/muralimethani/Book_Your_Show_Backend/blob/master/README.md#techonology-used)

2. ###### [EER Diagram](https://github.com/muralimethani/Book_Your_Show_Backend/blob/master/README.md#eer-diagram-1)
 
3. ###### [Functionalities](https://github.com/muralimethani/Book_Your_Show_Backend/blob/master/README.md#functionalities-1)

4. ###### [Postman Commands](https://github.com/muralimethani/Book_Your_Show_Backend/blob/master/README.md#postman-commands-1)





## Techonology Used

- ###### Java

- ###### Spring Boot

- ###### Hibernate

- ###### RESTful APIS

- ###### Maven

- ###### My SQL

- ###### Postman



## EER Diagram
(![bms](https://github.com/muralimethani/Book_Your_Show_Backend/assets/116708943/d3752252-2eec-4a2b-bd68-0c9a7e1ae96a))





## Functionalities

###### Customer

	• Add, Update, Delete User
	


		
		
###### Theater

	• Add Theater


###### Movies

	• Add Movies

    
###### Shows

	• Add Shows
  
###### Tickets

	• Book Tickets
      ○ Send email notification to the user
      
    • Cancel Tickets
      ○ Send email notification to the user




## Postman Commands

###### To Add User:

	http://localhost:8080/seller/add
	{
              "name" : "Panga",
              "age" : 22,
              "emailId" : "iamPanga@gmail.com",
              "mobNo" : "8367400578"
}



###### To Add Theater:
	
	localhost:8080/theater/add

	{
      "name": "String",
      "location": "String",
      "classicSeatsCount": int,
      "premiumSeatsCount": int
	}
	

###### To Add Movies:

	localhost:8080/movies/add

	{
      "movieName": "String",
      "genre": "ENUM Type",
      "language": "ENUM Type",
      "rating": double,
      "duration": int
	}
	



###### To Add Shows:
	
	localhost:8080/shows/add

	{
      "movieId":int,
      "theaterId": int,
      "classSeatPrice": int,
      "premiumSeatPrice": int,
      "showType": "ENUM Type",
      "showTime": "hh:mm:ss",
      "showDate":"yyyy-mm-dd"
	}
	
	
	
###### To Book Ticket:	

	localhost:8080/tickets/book
  
    {
      "showId": int,
      "requestedSeats": ["String", "String", "..."],
      "userId": int
	}


###### To Cancel Ticket:	

	localhost:8080/tickets/cancel-ticket
  
    {
      "ticketId" : int,
      "deleteTicketList":["String", "String", "..."]
	}
	

## Future Scope

1. Multiple user handling 
2. Seat locking during payment
3. Multiple Screen handling in theater
4. Payment Flow
5. Login and User Account Management
6. Authentication and Authorization

	





