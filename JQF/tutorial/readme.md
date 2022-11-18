javac -cp .:$(~/Documents/jqf/scripts/classpath.sh) CalendarLogic.java CalendarGenerator.java CalendarTest.java


java -cp .:$(jqf/scripts/classpath.sh) org.junit.runner.JUnitCore tutorial/CalendarTest



javac -cp .:$(scripts/classpath.sh) tutorial/CalendarLogic.java tutorial/CalendarGenerator.java tutorial/CalendarTest.java

bin/jqf-zest -c .:$(scripts/classpath.sh) tutorial/CalendarTest testLeapYear


javac -cp .:$(scripts/classpath.sh) CalendarLogic.java CalendarGenerator.java CalendarTest.java

bin/jqf-zest -c .:$(scripts/classpath.sh) CalendarTest testLeapYear