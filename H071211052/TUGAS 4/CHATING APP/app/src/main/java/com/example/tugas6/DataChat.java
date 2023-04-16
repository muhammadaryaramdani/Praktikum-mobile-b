package com.example.tugas6;

import java.util.ArrayList;
import java.util.List;

public class DataChat {

    private static List<List<ModelBubble>>chats(){
        List<List<ModelBubble>>chats = new ArrayList<>();
        //orang
        List<ModelBubble>chat1= new ArrayList<>();
        chat1.add(new ModelBubble("sayang","19.20", true));
        chat1.add(new ModelBubble("hai","19.21", false));
        chat1.add(new ModelBubble("dimana","19.21", true));
        chat1.add(new ModelBubble("kangen","19.25", false));
        chat1.add(new ModelBubble("Saya ","19.26", false));

        chats.add(chat1);

        List<ModelBubble>chat2= new ArrayList<>();
        chat2.add(new ModelBubble("Siapa?","19.01", true));
        chat2.add(new ModelBubble("Saya Orang Kedua","19.01", false));

        chats.add(chat2);

        List<ModelBubble>chat3= new ArrayList<>();
        chat3.add(new ModelBubble("Siapa?","18.47", true));
        chat3.add(new ModelBubble("Saya Orang Ketiga","18.47", false));

        chats.add(chat3);

        List<ModelBubble>chat4= new ArrayList<>();
        chat4.add(new ModelBubble("Siapa?","18.46", true));
        chat4.add(new ModelBubble("Saya Orang Keempat","18.46", false));

        chats.add(chat4);

        List<ModelBubble>chat5= new ArrayList<>();
        chat5.add(new ModelBubble("Siapa?","18.45", true));
        chat5.add(new ModelBubble("Saya Orang Kelima","18.45", false));

        chats.add(chat5);

        List<ModelBubble>chat6= new ArrayList<>();
        chat6.add(new ModelBubble("Siapa?","18.30", true));
        chat6.add(new ModelBubble("Saya Orang Keenam","18.31", false));

        chats.add(chat6);

        List<ModelBubble>chat7= new ArrayList<>();
        chat7.add(new ModelBubble("Siapa?","18.22", true));
        chat7.add(new ModelBubble("Saya Orang Ketujuh","18.23", false));

        chats.add(chat7);

        List<ModelBubble>chat8= new ArrayList<>();
        chat8.add(new ModelBubble("Siapa?","18.11", true));
        chat8.add(new ModelBubble("Saya Orang Kedelapan","18.19", false));

        chats.add(chat8);

        List<ModelBubble>chat9= new ArrayList<>();
        chat9.add(new ModelBubble("Siapa?","17.11", true));
        chat9.add(new ModelBubble("Saya Orang Kesembilan","17.08", false));

        chats.add(chat9);

        List<ModelBubble>chat10= new ArrayList<>();
        chat10.add(new ModelBubble("Siapa?","16.43", true));
        chat10.add(new ModelBubble("Saya Orang Kesepuluh","16.52", false));

        chats.add(chat10);


        return chats;
    }

    public static ArrayList<ModelChat>
    ambilDataChat() {
        ArrayList<ModelChat> dataChat = new ArrayList<>();
        dataChat.add(new ModelChat("LUFFY",chats().get(0), "https://i.pinimg.com/originals/eb/64/f7/eb64f77186a25db480c589d04f745b82.jpg", "081234567890", "Busy", "21.00"));
        dataChat.add(new ModelChat("ZORO", chats().get(1), "https://i.pinimg.com/originals/23/31/bf/2331bf4032f0237bc4ce5e0f876cfd2a.jpg", "0812233455677", "Available", "21.30"));
        dataChat.add(new ModelChat("LAW", chats().get(2), "https://i.pinimg.com/originals/e3/95/31/e39531f16a72e05c4b03c44f56641154.jpg", "082345678901", "On School", "20.08"));
        dataChat.add(new ModelChat("ROBIN", chats().get(3), "https://i.pinimg.com/originals/e8/65/55/e86555ee3ef1583f5fa21ac3795d5eb4.jpg", "081234567890", "On Riding", "20.02"));
        dataChat.add(new ModelChat("JINBE", chats().get(4), "https://i.pinimg.com/originals/23/96/43/239643b6fcd730c95a5019fdc642b5c6.jpg", "083456789012", "Is Dead", "01.12"));
        dataChat.add(new ModelChat("BROOK", chats().get(5), "https://i.pinimg.com/originals/d5/80/6e/d5806ecc88f8a396f8aff32b85a52fea.jpg", "085678901234", "Online", "Kemarin 13.20"));
        dataChat.add(new ModelChat("KID", chats().get(6), "https://i.pinimg.com/originals/0f/86/cc/0f86cc05f4635d8abe4949777e5df2d1.jpg", "088901234567", "Happy", "21.20"));
        dataChat.add(new ModelChat("KEPALA KUNING", chats().get(7), "https://i.pinimg.com/originals/e7/38/7e/e7387e200c281a9855969cd0d20faa57.jpg", "081098765432", "Lonely", "30 Feb 2023"));
        dataChat.add(new ModelChat("COBY", chats().get(8), "https://i.pinimg.com/originals/67/08/3b/67083b995acc6cc5b88c2e92443db2da.jpg", "088123456145", "Turneyy", "10.09"));
        dataChat.add(new ModelChat("MEIO", chats().get(9), "https://i.pinimg.com/originals/93/53/aa/9353aac9640e6239360376c82a8d4a41.jpg", "082937123908", "Gaming", "Recently"));
        return dataChat;


    }
}

