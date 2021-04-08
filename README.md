# Grouping App

## Running Instructions
**Clone the repository**
```
https://github.com/chandanaPerumalla/grouping-app.git
```

**Build the repository**
```
cd <project location>
gradle build
```

**Run the app**
```
java -jar <project location>/build/libs/app-1.0-SNAPSHOT.jar --file-path <Crunchbase file location> --columns <Comma separated list of column names to group by>
```

**Example**
```
java -jar build/libs/app-1.0-SNAPSHOT.jar --file-path /Users/chandu/Downloads/CrunchBase-Companies-2017-09-05.csv --columns "Company Name,Outlet Type,Contact Email"
```