Êþº¾   7   game_slot/Slot  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lgame_slot/Slot; strat (I)I  java/io/BufferedReader  java/io/InputStreamReader	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     (Ljava/io/Reader;)V	  ! " # out Ljava/io/PrintStream; % java/lang/StringBuilder ' 
æã¡é 
 $ )  * (Ljava/lang/String;)V
 $ , - . append (I)Ljava/lang/StringBuilder;
 $ 0 1 2 toString ()Ljava/lang/String;
 4 6 5 java/io/PrintStream 7 * println 9 Aãããè³­ãã¾ããï¼ -1 ãå¥åããã¨çµäºãã¾ã 
 4 ; < * print
  > ? 2 readLine
 A C B java/lang/Integer D E parseInt (Ljava/lang/String;)I G !æã¡éãä¸è¶³ãã¦ãã¾ã I 3å¥åã¨ã©ã¼ãçºçããã®ã§çµäºãã¾ã
  K L M exit (I)V O $è³­ãéãå¥åãã¦ãã ãã
  Q R S currentTimeMillis ()J      Ð W java/util/Random
 V 	
 V Z [  nextInt
 4 ] 7 M
 4 _ < M a å¤§å½ãã c 	å½ãã e ãããï¼! g 5ã²ã¼ã ã¯çµäºãã¾ãã  ç¾å¨ã®æã¡éã¯ i ã§ã
 $ k - l -(Ljava/lang/String;)Ljava/lang/StringBuilder; n java/io/IOException p java/lang/NumberFormatException money I yomikomi Ljava/io/BufferedReader; kakekin e Ljava/io/IOException; !Ljava/lang/NumberFormatException; time J slot random Ljava/util/Random; StackMapTable 
SourceFile 	Slot.java !               /     *· ±    
                    	      Ü    I» Y» Y² · · L§=²  » $Y&· (¶ +¶ /¶ 3²  8¶ :+¶ =¸ @=  § ê¤ ²  F¶ 3§ Öd;§ N²  H¶ 3¸ J§ N²  N¶ 3§ ³¸ P TaB6» VY· X:6§ 
¶ Y6d¡ÿò²  ¶ \¸ P!ÿÓ²  ¶ ^	  ²  `¶ 3èh`;§ Uop  ²  b¶ 3dh`;§ 6op  § op
  §  opd  ²  d¶ 3þì²  » $Yf· (¶ +h¶ j¶ /¶ 3¬   B \ m E R \ m U Y \ m  B l o E R l o U Y l o  
   ² ,              -  5  =  B  E  J  R   U # Y % ] & e ' l * m + u , x /  1  4  5  6  7  6 £ 9 « ; ¯ 3 ³ < » A Ã B Ë C Ó D Ö F ã G ë H ò I õ K  L( , RG T    R   I q r   7 s t   u r  ]  v w  m  v x   ¨ y z   ¥ { r    | }  ~   A ü  ü /F mO oý 
ü  V	ú 9@Mÿ     ø       