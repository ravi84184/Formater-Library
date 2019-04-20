# Formater-Library


The DateTimeFormat library is available from JitPack.

Step 1. **Add it in your root build.gradle at the end of repositories:**
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 
Step 2. **Add the dependency**
```
dependencies {
	        implementation 'com.github.ravi84184:Formater-Library:Tag'
	}
  ```

**Get Current Date**

```
// return Date value
Date state = DateTimeFormat.getCurrentDate();

// return String value
String date = DateTimeFormat.getCurrentDate("dd-MM-yyyy"); // date = "12-04-2019"
String date = DateTimeFormat.getCurrentDatedInddMMyyyy(); // date = "12/04/2019"
String date = DateTimeFormat.getCurrentDateInddMMMyyyy(); // date = "12 April 2019"
```

**Get Date in Millisecond**
```
// Current date in millisecond 
long millisecond = DateTimeFormat.DateToMillisecond(); // millisecond = 1555698600000

// Date object as source
long millisecond = DateTimeFormat.DateToMillisecond(new Date()); // millisecond = 1555698600000

// Date String as source
long millisecond = DateTimeFormat.DateToMillisecond("05-02-2010","dd-MM-yyyy"); millisecond = 1265308200000

```

**isToday**

```isToday``` Tell whether or not a given date is today date

```
// Date object as source
boolean state = DateTimeFormat.isTodayDate(new Date());

// Date String as source
boolean state = DateTimeFormat.isTodayDate("12-04-2019","dd-MM-yyyy");
boolean state = DateTimeFormat.isTodayDate("12 April,2019","dd MMM,yyyy");
```


**isAfter**

```isAfter``` Tell whether or not a given date is after current date

```
// Date object as source
boolean state = DateTimeFormat.isAterDate(new Date());
boolean state = DateTimeFormat.isAterDate(new Date(),new Date());

// Date String as source
boolean state = DateTimeFormat.isAterDate("12-04-2019","dd-MM-yyyy"); // with current date
boolean state = DateTimeFormat.isAterDate(date,comparDate,datePattern); // with your date
boolean state = DateTimeFormat.isAterDate("12-04-2019","12-04-2019","dd-MM-yyyy"); // with your date
```
  
**isBefore**

```isBefore``` Tell whether or not a given date is before current date

```
// Date object as source
boolean state = DateTimeFormat.isBeforeDate(new Date());
boolean state = DateTimeFormat.isBeforeDate(new Date(),new Date());

// Date String as source
boolean state = DateTimeFormat.isBeforeDate("12-04-2019","dd-MM-yyyy"); // with current date
boolean state = DateTimeFormat.isBeforeDate(date,comparDate,datePattern); // with your date
boolean state = DateTimeFormat.isBeforeDate("12-04-2019","12-04-2019","dd-MM-yyyy"); // with your date
```

**Change Date Pattern**
```
// Date object as source
String outputDate = DateTimeFormat.changeDatePattern(new Date(),String pattern);
String outputDate = DateTimeFormat.changeDatePattern(new Date(),"dd-MM-yyyy"); // outputDate = "12-04-2019"
String outputDate = DateTimeFormat.changeDatePattern(new Date(),"yyyy-MM-dd"); // outputDate = "2019-04-12"
String outputDate = DateTimeFormat.changeDatePattern(new Date(),"dd MMM yyyy"); //outputDate = "12 Aptil 2019"
String outputDate = DateTimeFormat.changeDatePattern(new Date(),"MMM,yyyy"); //outputDate = "April 2019"

// Date String as source
String outputDate = DateTimeFormat.changeDatePattern(String date,String inputDatePattern,String ouputDatePattern); //outputDate = "April 2019"
String outputDate = DateTimeFormat.changeDatePattern("10-04-2019","dd-MM-yyyy","yyyy-MM-dd");// outputDate = "2019-04-10"
String outputDate = DateTimeFormat.changeDatePattern("10-04-2019","dd-MM-yyyy","yyyy/MM/dd");// outputDate = "2019/04/10"
String outputDate = DateTimeFormat.changeDatePattern("10-04-2019","dd-MM-yyyy","MMM-yyyy");// outputDate = "April-2019"
```




