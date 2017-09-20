package com.example;

import java.util.Random;

public class Jokes {
    public String getJoke() {


        String jokess[] = {
                "How many light bulbs does it take to change a light bulb? A: They can't; they're not bright enough.",
                " How easy is it to count in binary? It’s as easy as 01 10 11",
                "Yo mamma is so fat that when she sat on a laptop, the hardware turned into software",
                "Yo momma is so fat, when she sat on an iPod, she made the iPad!",
                "Q: What did the spider do on the computer? A: Made a website!",
                "Q: What did the computer do at lunchtime? A: Had a byte!",
                "Q: What does a baby computer call his father? A: Data!",
                "Q: Why did the computer keep sneezing? A: It had a virus!",
                "Q: What is a computer virus? A: A terminal illness!",
                "Q: Why was the computer cold? A: It left it's Windows open!",
                "Q: Why was there a bug in the computer? A: Because it was looking for a byte to eat?",
                "Q: Why did the computer squeak? A: Because someone stepped on it's mouse!",
                "Q: What do you get when you cross a computer and a life guard? A: A screensaver!",
                "Q: Where do all the cool mice live? A: In their mousepads",
                "Q: What do you get when you cross a computer with an elephant? A: Lots of memory!",
                "Yo momma so fat when she registered for MySpace there was no space left.",
                "I decided to make my password \"incorrect\" because if I type it in wrong, my computer will remind me, \"Your password is incorrect.\"",
                "I put my phone on airplane mode, but it sure ain't flyin'.",
                "Im employed at a computer security company and have a colleague whose name is M. Alware. His e-mail address is malware@company.com.",
                "A computer once beat me at chess, but it was no match for me at kick boxing.",
                "What did one ocean say to the other ocean? Nothing, they just waved.",
                "If you owe the bank $100,000, the bank owns you. If you owe the bank $1,000,000,000, you own the bank.",
                "When everything's coming your way, you're in the wrong lane.",
                "Whenever I find the key to success, someone changes the lock.",
                "Why did the bee get married? Because he found his honey.",
                "I just let my mind wander, and it didn't come back.",
                "IRS: We've got what it takes to take what you've got.",
                "I asked God for a bike, but I know God works in mysterious ways. So I stole a bike and asked for forgiveness.",
                "If I agreed with you we'd both be wrong.",
                "If God is watching us, the least we can do is be entertaining.",
                "I like work: it fascinates me. I can sit and look at it for hours.",
                "What does an air conditioner have in common with a computer? They both lose efficiency as soon as you open windows",


        };

        int idxx = new Random().nextInt(jokess.length);
        return jokess[idxx];
    }
}


