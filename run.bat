@echo off
echo Compiling...
if not exist bin mkdir bin
"C:\Program Files\Java\jdk-25\bin\javac.exe" -d bin -cp ".;lib\*" src\*.java
if %errorlevel% neq 0 (
    echo Compilation failed!
    pause
    exit /b %errorlevel%
)
echo Running...
"C:\Program Files\Java\jdk-25\bin\java.exe" -cp "bin;lib\*" src.Main
pause
