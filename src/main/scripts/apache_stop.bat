@echo off
cd /D C:\xampp
echo Checking if Apache is running...

tasklist | find /I "httpd.exe" >nul
if errorlevel 1 (
    echo Apache is not running.
    goto :exit
)

echo Stopping Apache...
taskkill /F /IM httpd.exe

:exit
