import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String que = "";
        System.out.println("Hi Welcome!\nWhat is your name:");
        String reply = sc.nextLine();
        System.out.println("Hello " + reply);
        System.out.println(reply + " ask me anything about java----");
        que = sc.nextLine();
        while (true) {
            if (que.equals("java")) {
                System.out.println(
                        "Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.");
            } else if (que.equals("datatypes")) {
                System.out.println(
                        "Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:\nPrimitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.\nNon-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.");
            } else if (que.equals("features")) {
                System.out.println(
                        "1. Simple\n 2. Object-Oriented\n3. Portable\n4. Platform independent\n5. Secured\n6. Robust \n7. Architecture neutral \n9. Interpreted\n 10. High Performance\n11. Multithreaded \n12. Distributed \n13.Dynamic");
            } else if (que.equals("bye")) {
                break;
            } else {
                System.out.println("Please enter valid data");
            }
            System.out.println("Q----");
            que = sc.nextLine();
        }
        System.out.println("Bye, Nice to talk with you!\nThank you.");
    }
}



from tkinter import *
from nltk.chat.util import Chat, reflections
root = Tk()
root.title("Chatbot")
def send():
    send = "You -> "+e.get()
    txt.insert(END, "n"+send)
    user = e.get().lower()
    if(user == "hi good morning"):
        txt.insert(END, "\n" + "Bot -> hello good morning\n")
    elif(user == "hows the weather"):
        txt.insert(END, "\n" + "Bot -> It is very gloomy wheather!\n")
    elif(e.get() == "ok i am tanuja what is your name?"):
        txt.insert(END, "\n" + "Bot -> nice name! you call me Danyy\n")
    elif(user == "nice" or user == "ok great" or user == "okayy"):
        txt.insert(END, "\n" + "Bot -> how can i help you.\n")
    elif(user == "no thanks"):
        txt.insert(END, "\n" + "Bot ->ok, nice to talk with You!!!!\n")
    else:
        txt.insert(END, "\n" + "Bot -> sorry! i dind't got you\n")
    e.delete(0, END)
txt = Text(root)
txt.grid(row=0, column=0, columnspan=2)
e = Entry(root, width=100)
e.grid(row=1, column=0)
send = Button(root, text="Send", command=send).grid(row=1, column=1)
root.mainloop()
reflections = {
  "i am"       : "you are",
  "i was"      : "you were",
  "i"          : "you",
  "i'm"        : "you are",
  "i'd"        : "you would",
  "i've"       : "you have",
  "i'll"       : "you will",
  "my"         : "your",
  "you are"    : "I am",
  "you were"   : "I was",
  "you've"     : "I have",
  "you'll"     : "I will",
  "your"       : "my",
  "yours"      : "mine",
  "you"        : "me",
  "me"         : "you"
}
pairs = [
    [
        r"my name is (.*)",
        ["Hello %1, How are you today ?",]
    ],
    [
        r"hi|hey|hello",
        ["Hello", "Hey there",]
    ],
    [
        r"what is your name ?",
        ["I am a bot created by Analytics Mayuri. you can call me crazy!",]
    ],
    [
        r"how are you ?",
        ["I'm doing good and what about You ?",]
    ],
    [
        r"sorry (.*)",
        ["Its alright","Its OK, never mind",]
    ],
    [
        r"I am fine",
        ["Great to hear that, How can I help you?",]
    ],
    [
        r"i'm (.*) doing good",
        ["Nice to hear that","How can I help you?:)",]
    ],
    [
        r"(.*) age?",
        ["I'm a computer program dudenSeriously you are asking me this?",]
    ],
    [
        r"what (.*) want ?",
        ["Make me an offer I can't refuse",]
    ],
    [
        r"(.*) created ?",
        ["Mayuri created me using Python's NLTK library ","top secret ;)",]
    ],
    [
        r"(.*) (location|city) ?",
        ['pune, Maharahtra',]
    ],
    [
        r"how is weather in (.*)?",
        ["Weather in %1 is awesome like always","Too hot man here in %1","Too cold man here in %1","Never even heard about %1"]
    ],
    [
        r"i work in (.*)?",
        ["%1 is an Amazing company, I have heard about it. But they are in huge loss these days.",]
    ],
    [
        r"(.)raining in (.)",
        ["No rain since last week here in %2","Damn its raining too much here in %2"]
    ],
    [
        r"how (.) health(.)",
        ["I'm a computer program, so I'm always healthy ",]
    ],
    [
        r"(.*) (sports|game) ?",
        ["I'm a very big fan of Cricket",]
    ],
    [
        r"who (.*) sportsperson ?",
        ["K.L.Rahul","M.S.Dhoni","Virat Kohli"]
    ],
    [
        r"who (.*) (moviestar|actor)?",
        ["Salman Khan"]
    ],
    [
        r"i am looking for online guides and courses to learn data science, can you suggest?",
        ["Crazy_Tech has many great articles with each step explanation along with code, you can explore"]
    ],
    [
        r"quit",
        ["BBye take care. See you soon :) ","It was nice talking to you. See you soon :)"]
    ],
]
def chat():
    print("Hi! I am a chatbot created by Mayuri Kawade  for your service")
    chat = Chat(pairs, reflections)
    chat.converse()
#initiate the conversation
if _name_ == "_main_":
    chat()
