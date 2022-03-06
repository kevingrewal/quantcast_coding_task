# quantcast_coding_task
Finds Most Active Cookie

DESIGN:
  - Split into three classes: Main.java CookieLogs.java LogFileReader.java
  - Main runs the program
  - LogFileReader parses the file and builds structures to analyze frequency of cookies by date
  - CookieLogs class represents a single Cookie as an object

MORE:
  -PROGRAMMED IN JAVA USING INTELLIJ IDE
  -USED INTERNAL BASH SCRIPT TO MATCH CLI PROMPT (ie. ./most_active_cookie cookie_log.csv -d 2018-12-09)
  -USED JUNIT AS TESTING FRAMEWORK TO CREATE TWO TESTS (tests described in coding task for DATES: 2018-12-09, 2018-12-08)
