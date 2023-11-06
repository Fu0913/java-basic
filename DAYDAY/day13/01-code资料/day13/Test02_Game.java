package com.briup.day13;

import java.util.*;

public class Test02_Game {

    public static void main(String[] args) {
        //1.准备牌面值和花色
        List<String> colors = new ArrayList<>();
        List<String> values = new ArrayList<>();
        Collections.addAll(colors,"♠","♥","♣","♦");
        Collections.addAll(values,"3","4","5","6","7","8","9","10","J","Q","K","A","2");

        //2.遍历花色和牌面值 生成 54张牌 Card对象
        List<Card> cards = new ArrayList<>();
        int weight = -1;
        for(int i = 0; i < values.size(); i++) {
            weight = i+1;
            for(int j = 0; j < colors.size(); j++) {
                //实例化牌
                Card c = new Card(values.get(i),colors.get(j),weight);
                //添加到集合中
                cards.add(c);
            }
        }

        cards.add(new Card("小王","",++weight));
        cards.add(new Card("大王","",++weight));

        //3.洗牌
        Collections.shuffle(cards);

        //4.发牌：3个玩家 最后留3张底牌
        // 思路2：提供4个TreeSet对象，并提供排序算法
        Comparator<Card> comp = new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                //即使权重相同，也要添加元素成功
                int r = o1.getWeight() - o2.getWeight();
                return (r == 0) ? 1 : r;
            }
        };

        Set<Card> player1 = new TreeSet<>(comp);
        Set<Card> player2 = new TreeSet<>(comp);
        Set<Card> player3 = new TreeSet<>(comp);
        Set<Card> dipai = new TreeSet<>(comp);

        int size = cards.size();
        for(int i = 0; i < size; i++) {
            //      54-3==51   i: 51 52 53
            if(i >= size - 3) {
                dipai.add(cards.get(i));
            }else if(i % 3 == 0) {
                player1.add(cards.get(i));
            }else if(i % 3 == 1) {
                player2.add(cards.get(i));
            }else {
                player3.add(cards.get(i));
            }
        }

        //6.看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }

    public static void main01(String[] args) {
        //1.准备牌面值和花色
        List<String> colors = new ArrayList<>();
        List<String> values = new ArrayList<>();
        Collections.addAll(colors,"♠","♥","♣","♦");
        Collections.addAll(values,"3","4","5","6","7","8","9","10","J","Q","K","A","2");

        //2.遍历花色和牌面值 生成 54张牌 Card对象
        List<Card> cards = new ArrayList<>();
        int weight = -1;
        for(int i = 0; i < values.size(); i++) {
            weight = i+1;
            for(int j = 0; j < colors.size(); j++) {
                //实例化牌
                Card c = new Card(values.get(i),colors.get(j),weight);
                //添加到集合中
                cards.add(c);
            }
        }

        cards.add(new Card("小王","",++weight));
        cards.add(new Card("大王","",++weight));

        //3.洗牌
        Collections.shuffle(cards);

        //4.发牌：3个玩家 最后留3张底牌
        // 思路1：提供4个ArrayList对象存储牌，然后借助Collections.sort对集合进行排序
        // 思路2：提供4个TreeSet对象，并提供排序算法
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        List<Card> dipai = new ArrayList<>();

        int size = cards.size();
        for(int i = 0; i < size; i++) {
            //      54-3==51   i: 51 52 53
            if(i >= size - 3) {
                dipai.add(cards.get(i));
            }else if(i % 3 == 0) {
                player1.add(cards.get(i));
            }else if(i % 3 == 1) {
                player2.add(cards.get(i));
            }else {
                player3.add(cards.get(i));
            }
        }

        //5.对牌进行排序
        Comparator<Card> comp = new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };
        Collections.sort(player1,comp);
        Collections.sort(player2,comp);
        Collections.sort(player3,comp);
        Collections.sort(dipai,comp);


        //6.看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}

//扑克牌类：牌面值、花色、权重值
class Card {
    private String value;
    private String color;
    private int weight;

    public Card() {}
    public Card(String value,String color,int weight) {
        this.value = value;
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return color+value;
        //return color+value+":"+weight;
    }
}