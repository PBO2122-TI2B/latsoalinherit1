����   4 �
      java/lang/Object <init> ()V	  	 
   java/lang/System out Ljava/io/PrintStream;  ===MENU BANGUN DATAR===
      java/io/PrintStream println (Ljava/lang/String;)V  1. Persegi Panjang  2. Lingkaran  3. Segitiga  	4. Keluar  Masukkan pilihan Anda: 
    !  print # inheritance_amelia/BangunDatar
 "  & !inheritance_amelia/PersegiPanjang
 %  ) inheritance_amelia/Lingkaran
 (  , inheritance_amelia/Segitiga
 +  / java/util/Scanner	  1 2 3 in Ljava/io/InputStream;
 . 5  6 (Ljava/io/InputStream;)V
 8 9 : ;  inheritance_amelia/Inheritance menu
 . = > ? nextInt ()I A 
PERSEGI PANJANG C Masukkan panjang: 
 . E F G 	nextFloat ()F	 % I J K panjang F M Masukkan lebar: 	 % O P K lebar
 % R S G luas
 % U V G keliling
  X   Z 

LINGKARAN \ Masukkan jari-jari: 	 ( ^ _ K r
 ( R
 ( U c 	
SEGITIGA e Masukkan alas: 	 + g h K alas j Masukkan tinggi: 	 + l m K tinggi
 + R
 + U Code LineNumberTable LocalVariableTable this  Linheritance_amelia/Inheritance; main ([Ljava/lang/String;)V args [Ljava/lang/String; bangun  Linheritance_amelia/BangunDatar; pp #Linheritance_amelia/PersegiPanjang; lr Linheritance_amelia/Lingkaran; sg Linheritance_amelia/Segitiga; sc Ljava/util/Scanner; pilih I StackMapTable x MethodParameters 
SourceFile Inheritance.java ! 8           p   /     *� �    q        r        s t   	 ;   p   a      1� � � � � � � � � � � � �    q                 (  0  	 u v  p      � "Y� $L� %Y� 'M� (Y� *N� +Y� -:� .Y� 0� 4:� 7� <6�     �            X   �� @� � B� ,� D� H� L� ,� D� N,� QW,� TW� � W� m� Y� � [� -� D� ]-� `W-� aW� � W� A� b� � d� � D� f� i� � D� k� nW� oW� � W��/�    q   � "          !  -  0   7 ! T # \ $ d % m & u ' ~ ( � ) � * � + � - � . � / � 0 � 1 � 2 � 3 � 5 � 6 � 7 � 8 � 9 � : � ; � < � ? @ r   H    w x    � y z   � { |   � } ~  ! �  �  - � � �  7 � � �  �   " � -  � " % ( + .  � &<+= �    w    �    �