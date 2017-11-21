set projectLocation=C:\Users\sarvesh\sai\TurboPro
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\libs\*;
java org.testng.TestNG %projectLocation%\testng.xml


