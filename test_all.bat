@echo off
echo Running JUnit Unit Tests...
"C:\Program Files\Java\jdk-25\bin\java.exe" -cp "bin;lib\*" org.junit.runner.JUnitCore src.Hotel_ChainTest src.HotelTest src.ReservationTest src.ReserverPayerTest src.RoomTest src.RoomTypeTest src.How_ManyTest

echo.
echo Running Manual Integration Tests...
"C:\Program Files\Java\jdk-25\bin\java.exe" -cp "bin;lib\*" src.GuestTest
"C:\Program Files\Java\jdk-25\bin\java.exe" -cp "bin;lib\*" src.IntegrationTest

pause
