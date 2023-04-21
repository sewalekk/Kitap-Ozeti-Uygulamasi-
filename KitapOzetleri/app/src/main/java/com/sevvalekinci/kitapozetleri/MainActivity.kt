package com.sevvalekinci.kitapozetleri

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.kitapozet_karti.view.*


class MainActivity : AppCompatActivity() {

    var constList=ArrayList<kitaplar>()
    var adapter:kitaplarAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        constList.add(kitaplar("Aşk-ı Memnu", "Melih Bey, serbest yaşamayı, eğlenmeyi çok seven Firdevs Hanım’la evlidir.\n" +
                "\n" +
                "Firdevs Hanım, kocasını umursamayan, başkalarının aşk tekliflerine cevap veren bir tiptir.\n" +
                "\n" +
                "Bir gün Melih Bey, karısının âşıklarına yazdığı aşk mektuplarını bulur ve bir süre sonra üzüntüsünden ölür.\n" +
                "\n" +
                "Firdevs Hanım’ın Peyker ve Bihter adlı iki genç kızı vardır. İkisi de anneleri gibi ihtiraslıdır.\n" +
                "\n" +
                "Firdevs Hanım, yaşlı olmasına rağmen kızlarıyla her konuda yarışmakta genç ve güzel görünmek için her yola başvurmaktadır. Korktuğu tek şey “valide” olmaktır. Bu yüzden kızlarının evlenmesine karşı çıkar. Ne var ki Peyker, annesini dinlemez ve evlenir.\n" +
                "\n" +
                "Romanda bu ailenin yolları, Adnan Bey ailesiyle kesişir. Karısı ölen Adnan Bey kızı Nihal ve oğlu Bülent ile yaşamaktadır. Varlıklı ve kibar Adnan Bey, genç yaştaki Bihter’le evlenir.\n" +
                "\n" +
                "Bihter zamanla kocasının yeğeni Behlül’e aşık olur. Firdevs Hanım, kızı olmasına rağmen Bihter’i çok kıskanmaktadır. Bihter’in Behlül’le ilişkisini engellemek için Nihal ile Behlül’ü evlendirmeye çalışır.\n" +
                "\n" +
                "Behlül, Nihal ile nişan hazırlıklarına başlar. Bihter buna çok üzülür. Aşkını korumak için bir süre mücadele eder; “yasak aşk”ının ortaya çıkması üzerine de canına kıyar. Behlül kaçar, Nihal de hayalleri kırılmış olarak, eskisi gibi babasıyla yaşamaya devam eder.",R.drawable.a))
        constList.add(kitaplar("Sırça Köşk", "Boş gezmeyi iş yapmaktan çok seven üç uyanık arkadaş bir şehre gelirler ve şehrin yerlilerine sırça köşkün nerede olduğunu soralar. Daha önce sırça köşkün ne olduğunu duymayan halk adamlara bunu sorar fakat adamlar sırça köşkün olmadığı bir yerde kesinlikle durmayacaklarını söyleyerek şehri terk etmek ister. Merak artınca halk gitmelerine izin vermez ve sırça köşkün ne olduğunu gerekirse yapabileceklerini söylerler. Bunun üzerine halktan para toplanır ve bir sırça köşk yapılır. Üç arkadaş sırça köşke yerleşir ve halka bunun tam olmadığını ama şimdilik idare edeceğini artık sırça köşke hizmet etmek gerektiğini bilidir. Bunun üzerine halk yediğinden içtiğinden keser ve sırça köşkün büyümesi için daha fazla para toplar. Sırça köşk git gide büyür ve içindeki hizmetçi sayısı da artar. Fakat sırça köşkün gözü doymak bilmez ve büyüdükçe büyümek ister. Hep daha fazlasını ister, karşı çıkanları tehdit etmeye başlar, köşkün çok sağlam olduğu, asla yıkılamayacağı ve halkın ona muhtaç olduğunu anlatarak halktan para toplamaya devam eder.\n" +
                "\n" +
                "Bir gün halktan son koyunları toplanır ve halka mesaj vermek için aslında sırça köşktekilerin yediklerinden fedakarlık yaparak koyların kafalarının halka dağıtılacağı söylenir. Kafaları alan halkın kafası iyice karışır. Çünkü kafaların içinden beyin alınmıştır. Elebaşı beyne ihtiyaçlarının olmadığını söyler. Biri de dilin olmadığını söyler. Elebaşı yine dile lüzum olmadığını söyler. Biri de gözlerin olmadığını söyler. Elebaşı yine ona da gerek yok der. İçlerinden biri dayanamaz ve ben böyle kafaya da gerek yok deyip kafayı sırça köşke fırlatır. Yıkılmaz denilen sırça köşk kafanın dokunması ise kırılır. Bunu gören halk birden kendine gelir ve herkes kafaları sırça köşke fırlatarak onu yerle bir eder. Bir daha da başlarına böyle tepelerine sırça köşk kurmamak için akıllanır.",R.drawable.b))
        constList.add(kitaplar("Falaka", "Kahramanımız kırk arkadaşı ile birlikte bir kuran kursuna gitmektedir. Burada huysuz bir hoca bulunmaktadır. Bu hoca çocuklara iyi bir eğitim veremediği gibi onları da falakaya çekiyordur. Bir de bu hocanın her gün camiye gidip geldiği eşeği bulunmaktadır, çocuklar ona Abdurrahman Çelebi ismini takmışlardır. \n" +
                "\n" +
                "Bir gün bu kursu kaymakam denetlemeye gelir bir kaç çocuğa kuran okutmak istese de başarısızlık ortadadır. Sinirlenen kaymakam hoca efendiyle konuşarak orada bulunan falakayı kaldırmasını ister. Falakanın kalktığını gören çocuklar günden güne dahada arsızlaşır hocaya yapmadıklarını bırakmazlar. Bunun üzerine hoca falakayı geri çıkararak çocukları eskisinden daha çok ve sert dövmeye başlar.\n" +
                "\n" +
                "Hocanın bir de kullandığı enfitye denilen bir toz vardır. Bu toz burna çekilince fena bir şekilde  hapşurtmaktadır. Bizim afacanlar tabi yerinde durmaz bir gün esneme numarası ile hocayı  uyuturlar, Hocanın tozunu alıp hep birlikte burna çekmeye ve hapşurmaya başlarlar. Gürültüye uyanan hoca çok sinirlenir ve çocukları bir güzel döver ve onlara bir daha hapşuran ve esneyen olursa şart olsun ki  onları öldüresiye döveceğini söyler.\n" +
                "\n" +
                "Bu söz kahramanımızın kafasına çok takılır annesine söyler. Annesi  bunun büyük bir yemin olduğunu, karısın boşamak kadar anlama gelebileceğini söyler. Artık bu kelime çocukların diline dolanmıştır bir şey olduğu zaman şart olsun diyorlardı. Kahramanımız camide bulundukları bir esnada hocanın enfiye sini alıp bir kağıda döker gidip bunu da hocanın eşeğinin burnuna üfler hayvancağız tozun etkisi ile şahlanıp hapşu demeye başlar. Oraya gelen hoca eşeğe ne olduğunu sorar çocuklar hapşurduğunu şart koştuğunuz için onu falaka ya yatırması gerektiğini söyleyip dururlar. Hep bir ağızdan Şart olsun ki nikahının düşeceğini söyleyip dururlar. Ne yapacağını bilemeyen hoca eşeği falakaya yatırır. O esnada oradan geçen kaymakam olayı görüp gelir ve hocayı onunla gelmesini söyler. O günden bugüne kahramanımız ne o hocayı nede falakayı görmemiştir. Her hap şuranı gördüğü zaman aklına bu hikaye gelip vicdan azabı duymaktadır.",R.drawable.falaka))
        constList.add(kitaplar("İçimizdeki Şeytan", "Ömer, Balıkesir’den İstanbul’a eğitim için gelen ancak okulunu yarım bırakıp çalışmaya başlayan yirmi beşinde bir delikanlıdır. Başta gençliğin verdiği heyecanla dönemin memleket meseleleri ile ilgilenip dergiler peşinde koşsa da zamanla coşku ve fikirlerini yumuşatmış, kendini yalnızca haytalığa vermiştir. Ta ki vapurda sonradan uzak akrabası olduğunu öğrendiği Macide ile karşılaşana kadar.\n" +
                "\n" +
                "Macide, babasını kaybetmiş, müziğe olan yeteneği sayesinde konservatuvar eğitimi için Balıkesir’den İstanbul’a gelmiş ancak içini, şehrin çirkinliklerine açamamış bir kızdır. Bu iki uzak akraba, yalnızca yollarının kesişmesinden midir, bilinmez kısa zamanda birlikte olmaya başlarlar. Çok çabuk bir araya geldikleri için birbirlerini beraberken tanımaya başlayan Ömer ve Macide’nin ne kadar farklı olduklarını anlamaları ise uzun sürmez.",R.drawable.icimizdekiseytan))
        constList.add(kitaplar("İntibah", "Roman karakteri Ali Bey, varlıklı bir ailenin tek çocuğudur. İyi bir eğitim hayatı geçirmiş, on yaşına gelinceye kadar birkaç dil öğrenmiştir. Ali Bey, yirmili yaşlara geldiğinde babası ölür, bundan sonra daha rahat ve keyfi bir bir yaşam sürer. Çamlıca'daki bir gezintisinde bir kadınla tanışır. Kadını oldukça çekici bulur fakat bu kadın Ali Bey'e pek uygun değildir. Adı Mahpeyker olan bu kadın Suriye'de kötü işler yaparak zengin olan Abdullah Efendi ile birlikte dost hayatı sürdürmektedir. Ali Bey'in annesi oğlunun böyle bir kadını beğenmesini kabul etmez ve evlerine Dilaşup adında genç ve güzel bir cariyeyi çağırır fakat oğlunu vazgeçiremez. Ali Bey bir gün yalıya gider fakat Mahpeyker'i evinde bulamaz. Mahpeyker, Abdullah Efendi ile buluşmaya gitmiştir. Bütün gece yalıda Mahpeyker'i bekler, sabah olunca da onunla karşılaşır ve kavga eder, daha sonra ayrılırlar. Bu noktadan sonra Ali Bey, cariye olan Dilaşup'la ilgilenmeye başlar. Mahpeyker ise Abdullah Efendi ile birlikte Dilaşup'a karşı bir plan yapar. Bazı erkekler Ali Bey'e bu plan dahilinde bir şeyler söyler, Ali Bey buna sinirlenir ve Dilaşup'u döver. Artık Ali Bey hastalanır ve Dilaşup'u bir esirciye satar. Dilaşup'u esirciden alan kişi ise Mahpeyker olur ve onu kötü düşüncelere sevk etmek ister fakat Dilaşup buna direnç göstermektedir. İlerleyen dönemlerde Ali Bey mal varlığını kaybetmiş duruma gelir, Annesi ise bir kiralık evde hayatını kaybeder. Daha sonraları Mahpeyker Ali Bey'i öldürmek ister ve bunun için bir plan yapar. Planı, Çamlıca'daki bir eğlencede Ali Bey'i bıçaklatıp öldürtmektir. Bunu haber alan Dilaşup ise eğlenceye katılan Ali Bey'e haber verir. Ali Bey hemen bir çarşaf giyerek karakola gider. Bu esnada Ali Bey'in paltosunu giyen Dilaşup, Ali Bey sanılarak öldürülür. Zaptiyelerle geri dönen Ali Bey, Dilaşup'un ölümünü kabullenemez ve Mahpeyker'i öldürür. Hapishaneye giren Ali Bey, altı ay sonra hayatını kaybeder.",R.drawable.intibah))
        constList.add(kitaplar("Kuyrukluyıldız Altında Bir İzdivaç", "Mayıs 1910’da Halley Kuyruklu Yıldızı’nın dünyaya çarpacağı söylentileri yayılmıştır. Bu haber dünyada olduğu gibi İstanbul’da da panik yaratmaya başlar. Gece kondulardaki cahil kadınlar da bu eseri kendi anlayışlarına göre yorumlamaktadır. Romanın kahramanı İrfan Galib de bu mahallede yaşamaktadır. Varlıklı bir ailenin oğlu olan İrfan, batı bilimleri okumuş, ancak tuhaflıkları olan geniş görüşlü bir gençtir. Yolda peçeli bir kadın görür. Onun çok güzel ve bilgili bir genç kız olduğunu hayal ederek peşinden koşar. Birçok tesadüften sonra bu güzelliğin hayalini kurar. Beceriksiz bir konuşma girişiminden sonra kadın tarafından reddedilir. Bu olay onu büyük bir kadın düşmanı yapar. Kadınların zayıflığı üzerine makaleler yazıyor. Kadınları korkutmak ve aşağılamak için Halley Kuyruklu Yıldızı hakkında konferanslar düzenlemeye karar verir. Garip anatomi, astronomi ve fizik konferansına ve bir kuyruklu yıldız çarpmasıyla noktalanan korkunç kıyamet rüyasını ekliyor. Bir süre sonra maceraperest bir kadından bir mektup alır. İrfan, bu mektuba coşkulu ve duygusal bir yanıt yazdıktan sonra konferansının ikinci bölümünü hazırlıyor. Ev halkını ve mahalle esnafını kıyametin kopacağına inandırdı. Herkes itiraflarda bulunarak birbirine veda eder. İkinci konferansta İrfan kıyamet sahnesini anlatırken daha önce hazırladığı küçük oyun sahnelendi. Etrafta patlayan çatlaklar ve havai fişekler, üst katlarda devrilen masalar ve dolaplar kadınları çıldırtıyor. Bu sırada tanımadığı bir hayranıyla yazışmaları devam eder. Hakkında çok kötü şeyler öğrenmesine rağmen ona evlenme teklif eder. Kadının bu evlilik için bir şartı vardır. Kuyruklu yıldız çarpmadan yüzünü İrfan’a göstermeyecek. Düğün, Halley’nin ortaya çıkacağı gün gerçekleşir. Evin çatısında dürbünle gökyüzünü arayan gelin ve damat arasında bilimsel, felsefi ve uzun sohbetler gerçekleşir. Evliliğinin ilk gününden itibaren genç gelin, bilgeliğini ve bilgisini kocasına kanıtladı ve eşit şartlarda sürecek bir birlikteliğin temellerini attı. Gelin, kadınların intikamını almak için İrfan’dan bir oyun yaptı ve bu oyunun sonunda İrfan’ın kendisine iyi bir koca olacağını anlar.\n" +
                "\n",R.drawable.kuyrukluyildiz))

        adapter= kitaplarAdapter(this,constList)
        listView.adapter=adapter
    }

    class kitaplarAdapter: BaseAdapter {
        var constList=ArrayList<kitaplar>()
        var context:Context?=null

        constructor(context: Context,constList:ArrayList<kitaplar>):super(){
            this.constList=constList
            this.context=context
        }

        override fun getCount(): Int {
            return constList.size
        }

        override fun getItem(p0: Int): Any {
            return constList[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var posKitaplar=constList[p0]
            var inflator=context!!.getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var kitapOzeti=inflator.inflate(R.layout.kitapozet_karti,null)
            kitapOzeti.kartAdi.text=posKitaplar.constAdi
            kitapOzeti.kartAciklama.text=posKitaplar.constAciklama
            kitapOzeti.kartResim.setImageResource(posKitaplar.constResim!!)

            kitapOzeti.kartResim.setOnClickListener{
                var intent = Intent(context,Kitaplar_detay::class.java)
                intent.putExtra("constAdi",posKitaplar.constAdi)
                intent.putExtra("constAciklama",posKitaplar.constAciklama)
                intent.putExtra("constResim",posKitaplar.constResim)
                context!!.startActivity(intent)



            }
            return kitapOzeti
        }

    }
}