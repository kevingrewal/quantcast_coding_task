# quantcast_coding_task
Finds Most Active Cookie

DESIGN:
  - Split into three classes: Main.java CookieLogs.java LogFileReader.java
  - Main runs the program
  - LogFileReader parses the file and builds structures to analyze frequency of cookies by date
  - CookieLogs class represents a single Cookie as an object

MORE:
  - Programmed in java using IntelliJ IDE
  - Integrated internal bash script to match CLI prompt (ie. ./most_active_cookie cookie_log.csv -d 2018-12-09)
  - Used JUnit as testing framework to create two tests (tests described in coding task for dates: 2018-12-09, 2018-12-08)
