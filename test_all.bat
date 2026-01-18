@echo off
echo Running JUnit Unit Tests...
"C:\Program Files\Java\jdk-25\bin\java.exe" -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore Hotel_ChainTest HotelTest ReservationTest ReserverPayerTest RoomTest RoomTypeTest How_ManyTest

echo.
echo Running Manual Integration Tests...
"C:\Program Files\Java\jdk-25\bin\java.exe" -cp "." GuestTest
"C:\Program Files\Java\jdk-25\bin\java.exe" -cp "." IntegrationTest

pause
