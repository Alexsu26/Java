package castle.src;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private HashMap<String, Handler> handlers = new HashMap<>();

    public Game() {
        handlers.put("go", new HandlerGo(this));
        handlers.put("bye", new HandlerBye(this));
        handlers.put("help", new HandlerHelp(this));
        createRooms();
    }

    private void createRooms() {
        Room outside, lobby, pub, study, bedroom;

        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");

        //	初始化房间的出口
        outside.setExit("south", lobby);
        outside.setExit("east", study);
        outside.setExit("west", pub);
        lobby.setExit("west", outside);
        pub.setExit("south", outside);
        study.setExit("north", outside);
        study.setExit("south", bedroom);
        bedroom.setExit("west", study);

        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();

    }

    // 以下为用户命令

    public void goRoom(String direction) {
        Room nextRoom = currentRoom.getExit(direction);


        if (nextRoom == null) {
            System.out.println("那里没有门！");
        } else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    public void showPrompt() {
        System.out.println("现在你在" + currentRoom);
        System.out.print("出口有：");
        System.out.print(currentRoom.getExitDes());
        System.out.println();
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            Handler handler = handlers.get(words[0]);
            String value = "";
            if( words.length > 1)
                value = words[1];
            if( handler != null ) {
                handler.doCmd( value );
                if( handler.isBye() )
                    break;
            }
//            if (words[0].equals("help")) {
//                game.printHelp();
//            } else if (words[0].equals("go")) {
//                game.goRoom(words[1]);
//            } else if (words[0].equals("bye")) {
//                break;
//            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.printWelcome();
        game.play();


        System.out.println("感谢您的光临。再见！");
    }

}
