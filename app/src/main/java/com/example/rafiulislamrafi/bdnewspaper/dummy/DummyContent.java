package com.example.rafiulislamrafi.bdnewspaper.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {

    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "প্রথম আলো", "http://m.prothom-alo.com/"));
        addItem(new DummyItem("2", "কালের কণ্ঠ", "http://www.kalerkantho.com/"));
        addItem(new DummyItem("3", "দৈনিক নয়া দিগন্ত", "http://m.dailynayadiganta.com/"));
        addItem(new DummyItem("4", "আমাদের সময়", "http://www.amadershomoy.biz/beta/"));
        addItem(new DummyItem("5", "দৈনিক মানবজমিন", "http://mybangla24.com/manobjomin_online_bangla_newspaper.php"));
        addItem(new DummyItem("6", "ভোরের কাগজ", "http://www.bhorerkagoj.net/online/"));
        addItem(new DummyItem("7", "যায় যায় দিন", "http://www.jaijaidinbd.com/"));
        addItem(new DummyItem("8", "দৈনিক ইত্তেফাক", "http://www.ittefaq.com.bd/"));
        addItem(new DummyItem("9", "দৈনিক যুগান্তর", "http://www.jugantor.com/"));
        addItem(new DummyItem("10", "বাংলাদেশ প্রতিদিন", "http://www.bd-pratidin.com/"));
        addItem(new DummyItem("11", "দৈনিক সমকাল", "http://bangla.samakal.net/"));
        addItem(new DummyItem("12", "দৈনিক ইনকিলাব", "https://www.dailyinqilab.com/"));
        addItem(new DummyItem("13", "দৈনিক সংবাদ", "http://www.thedailysangbad.com/"));
        addItem(new DummyItem("14", "দৈনিক দিনকাল", "http://www.dailydinkal.net/2016/08/17/index.php"));
        addItem(new DummyItem("15", "নয়া দিগন্ত", "http://m.dailynayadiganta.com/"));
        addItem(new DummyItem("16", "দৈনিক সংগ্রাম ", "http://www.dailysangram.com/"));
        addItem(new DummyItem("17", "মানবকণ্ঠ", "http://www.manobkantha.com/"));
        addItem(new DummyItem("18", "সকালের খবর", "http://www.shokalerkhobor24.com/"));
        addItem(new DummyItem("19", "আজকের পত্রিকা", "http://www.ajkerpatrika.com/"));
        addItem(new DummyItem("20", "প্রতিদিনের সংবাদ", "http://www.protidinersangbad.com/"));
        addItem(new DummyItem("21", "প্রিয়.কম", "http://www.priyo.com/"));
        addItem(new DummyItem("22", "সোনালী সংবাদ", "http://sonalisangbad.com/"));
        addItem(new DummyItem("23", "দৈনিক করতোয়া", "http://www.karatoa.com.bd/"));
        addItem(new DummyItem("24", "বাংলা নিউজ 24", "http://m.banglanews24.com/"));
        addItem(new DummyItem("25", "জাগো নিউজ 24", "http://www.jagonews24.com/m/"));
        addItem(new DummyItem("26", "বাংলা ট্রিবিউন", "http://m.banglatribune.com/"));
        addItem(new DummyItem("27", "তাজাখবর", "http://taza-khobor.com/bd/"));
        addItem(new DummyItem("28", "টেকশহর", "http://techshohor.com/"));
        addItem(new DummyItem("30", "দৈনিক জনকণ্ঠ", "https://www.dailyjanakantha.com/"));
        addItem(new DummyItem("29", "The daily star", "http://www.thedailystar.net/"));


        //http://techshohor.com/


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class DummyItem {
        public String id;
        public String item_name;
        public String url;

        public DummyItem(String id, String item_name, String url) {
            this.id = id;
            this.item_name = item_name;
            this.url = url;

        }

        @Override
        public String toString() {
            return item_name;
        }
    }
}
