package Classes.Utils;

import java.util.Random;

public class Utils {
    public static Random random = new Random();

    public static int getRandInt(int size)
    {
        return random.nextInt(size + 1);
    }


    private static String[] names =
            {
                    "Opera","Google_Chrome","Mozila_Fox","Github_Desktop","Discord","Process_Hacker_2","PDF_Viewer","Telegram","Battle.net","Zoom",
                    "µTorrent","Steam","Proteus","Heartstone","Grand_theft_auto_V","Sid_Meier's_Civilization_VI","DAEMON_Tools_Lite","Sasha_Vetrogon",
                    "Micro_Cap_12","World_Of_Warcraft","Overwatch","Overwolf","Word","Excel","Powerpoint","CodeSyS","Rockstar_Game_Launcher",
                    "Visual_Studio_2019","Intellij_IDEA","Epic_Games_Launcher","Dota2","CS_GO","Path_Of_Exile","Lightshot","Notepad++",
                    "Internet_Explorer",

            };



    public static String generate()
    {
        String result = "";

        result += names[random.nextInt(names.length)];

        result += ".exe";

        return result;
    }
    public static int getRandInt(int left, int right)
    {
        return left + random.nextInt(right - left + 1);
    }

    public static boolean getRandBool()
    {
        return random.nextBoolean();
    }

}