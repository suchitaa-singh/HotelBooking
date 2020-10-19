# HotelBooking

Available api :
Create booking checks for available room, if room is available it does the booking
Post : http://localhost:8081/v1/booking/
Request :
{
	"name" : "XYZ",
	"checkIn" : "2020-10-10",
	"checkOut" : "2020-10-12",
	"customerInfo" : {
		"name" : "XYZ",
		"mail" : "XYZ",
		"phoneNumber" : "+9197008998"
	},
	"roomInfo" : {
		"capacity" : 4
	},
	"totalAmount" : 200.05
}

Fetch booking info
Get : http://localhost:8081/v1/booking/{id}

Technical specification :
Spring boot
JPA
H2 database
Rest API


To run docker :
docker build -t hotel .
docker run -p 8081:8081 hotel


