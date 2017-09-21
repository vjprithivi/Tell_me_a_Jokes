# Tell_me_jokes
Nanodegree - Build It Bigger
Tell Me a Joke (Free) is an Android app loads jokes from Google Cloud Endpoint and uses a separate java library to display the jokes.
The app is divided into two Flavours Paid and the Free Version. 
Free Version loads banner ads and interstitial ads between activities.
It has a dedicated Java library to supply jokes to the Google Cloud Endpoint (GCE).
Project loads joke from GCE module via an AsyncTask.
![](https://github.com/vjprithivi/Tell_me_jokes/blob/master/screenshort/1.jpg | width=100)

Features
Tell Me a Joke contains a Java library for supplying jokes.
Tell Me a Joke contains an Android library with an activity that displays jokes passed to it as intent extras.
Tell Me a Joke contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads joke from GCE module via an AsyncTask.
Tell Me a Joke contains connected tests to verify that the AsyncTask is indeed loading jokes.
Tell Me a Joke contains paid/free flavors. The paid flavor has no ads and no unnecessary dependencies.
App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library.
Free app variant displays interstitial ads between the main activity and the joke-displaying activity.
App displays a loading indicator while the joke is being fetched from the server.
Gradle task that starts the GCE dev server, runs all the Android tests and shuts down the dev server
