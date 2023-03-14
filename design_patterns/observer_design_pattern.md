# Observer Pattern

[source of telusko](https://www.youtube.com/watch?v=98DiwRp-KZk&list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol&index=12&ab_channel=Telusko)

* falls under **behavioral** (how objects communicate with each other) pattern category.
* It is used where there is one-to-many relationship between objects.
* If one object is modified its dependent objects are to be modified.

Observer pattern uses three actor class. Subject, Observer and client. 


## Example or Real Scenario

Implementation of a youtube notification system. When a channel upload a video, all the subscriber of that channel are notified about that video. How can we implement this?

One way is to repeatedly check about the channel page from the subscriber end, if there is any new video uploaded or not. This is simpler but not efficient. 

Another way is to notify everyone from the channel end. This is much more efficient.

Telusko video tutorial has done similar type of publisher subscriber system.

The Channel.java will be look like this 

```
package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Subscriber> subs = new ArrayList<>();
    String title;

    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber sub: subs) {
            sub.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscriber();
    }

}
```

And the Subscriber (Observer) class will be
```
package ObserverDesignPattern;

public class Subscriber implements Observer {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + ", Video Uploaded : " + channel.title);
    }

    @Override
    public void subscribeChannel(Channel ch) {
        channel = ch;
    }

}
```

Finally the client class or the Youtube.java class will be look like this:

```
package ObserverDesignPattern;

public class Youtube {

    public static void main(String[] args) {

        Channel zidane = new Channel();

        Subscriber s1 = new Subscriber("ronaldo");
        Subscriber s2 = new Subscriber("messi");
        Subscriber s3 = new Subscriber("muller");

        // zidane gets to know who are his subscriber
        zidane.subscribe(s1);
        zidane.subscribe(s2);
        zidane.subscribe(s3);

        zidane.unSubscribe(s3);

        // the subscriber are subscribing zidane
        s1.subscribeChannel(zidane);
        s2.subscribeChannel(zidane);
        s3.subscribeChannel(zidane);

        zidane.upload("how to kick football");


    }
}
```

lately using refactoring they implemented the interface of this classes.