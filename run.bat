@echo off
echo Compiling...
"C:\Program Files\Java\jdk-25\bin\javac.exe" -cp ".;junit-4.13.2.jar" Guest.java Hotel.java Hotel_Chain.java How_Many.java Reservation.java ReserverPayer.java Room.java RoomType.java Main.java
if %errorlevel% neq 0 (
    echo Compilation failed!
    pause
    exit /b %errorlevel%
)
echo Running...
"C:\Program Files\Java\jdk-25\bin\java.exe" Main
pause
