# Covid19India CLI

Fetches data from api.covid19india.org and displays it on terminal

## Technologies Used :

* [Java](https://www.java.com/en/)
* [Maven](https://maven.apache.org)
* [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.5)
* [OkHttp3](https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp/3.9.0)
* [okio](https://mvnrepository.com/artifact/com.squareup.okio/okio/2.2.2)

## API used to retrieve information :

| Data                                                  | URL                                                   |
| ----------------------------------------------------- | ----------------------------------------------------- |
| National time series, statewise stats and test counts | https://api.covid19india.org/data.json                |
| Raw data                                              | https://api.covid19india.org/raw_data.json            |


## How this program works :

1. Program fetches data from https://api.covid19india.org/
2. Once data is fetched from https://api.covid19india.org/raw_data.json in the form of JSON its parsed and individual districts are identified from the json and appended to hashMap along with respective counts.
3. Then program fetches data from https://api.covid19india.org/data.json in the form of JSON. This gives a total count for each state along with StateName, Number of Confirmed, Hospitalized, Recovered and Deceased cases.
4. The program then lists this information along with district-wise information in descending order.

## Steps to execute the Java program :

1. Fork / clone this repository
2. cd into this directory on your computer terminal and run the command :
```
mvn package
```
This will build the BIG FAT JAR that we'll use to run the program
3. Once the BIG FAT JAR is built successfully run the following command to execute the program :
```
Command :

java -jar java -jar target/covid19india-1.0-jar-with-dependencies.jar

```

## Output of this program :

This program outputs text on terminal

Sample output:
```
*********
State Total
Confirmed 2012
Hospitalized 1788
Recovered 169
Deceased 55
*********
State Maharashtra
Confirmed 335
Hospitalized 283
Recovered 39
Deceased 13

District Wise
Mumbai 141
Pune 52
Sangli 25
Nagpur 12
Ahmadnagar 8
Buldana 5
Thane 5
Yavatmal 4
Mumbai Suburban 4
Satara 2
Kolhapur 2
Nashik 1
Gondiya 1
Jalgaon 1
Aurangabad 1
Ratnagiri 1
Unknown 70
*********
State Kerala
Confirmed 265
Hospitalized 237
Recovered 26
Deceased 2

District Wise
Kasaragod 121
Kannur 47
Ernakulam 23
Pathanamthitta 12
Malappuram 12
Thiruvananthapuram 12
Thrissur 10
Kozhikode 6
Palakkad 6
Idukki 5
Wayanad 3
Kottayam 3
Kollam 3
Alappuzha 2
*********
```

If there are cases within a state that do not have information related to which district they were identified in, then those cases are all grouped together state-wise and a total count of these cases is printed at the end of district-wise list as `Unknown`