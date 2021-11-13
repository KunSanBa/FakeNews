package com.aleksandrkunevich.android.fakenews.data

import com.aleksandrkunevich.android.fakenews.domain.FakeNewsInteractor
import com.aleksandrkunevich.android.fakenews.presentation.recycler.FakeNews

class FakeNewsDataSource : FakeNewsInteractor {

    override fun loadNews(): List<FakeNews> {
        return listFakeNews
    }

    private val listFakeNews: List<FakeNews> = listOf(
        FakeNews(
            "Погода на выходные и дальше: до 12 мороза и снег на горизонте",
            "БелГидроМете",
            "13.11.2021",
            "Погода",
            "Еще утром в пятницу на севере страны в некоторых местах лежал слой снега до 3 сантиметров, потом временно отступил. Говорят, кое-где зимние рыбаки уже столпились на берегу, не моргая смотрят на воду. Чего-то ждут."
        ),
        FakeNews(
            "Россию ждёт еврозима",
            "МетеоВести",
            "11.11.2021",
            "Погода",
            "Предстоящей зимой на большей части Европейской России ожидается преобладание циклонов с характерной пасмурной погодой и осадками преимущественно в виде снега. Причём из них, примерно в 60-70% случаев будут господствовать циклоны с северо-запада, что указывает на сильный зональный (широтный) перенос, который и обеспечит Среднерусскую равнину достаточным количеством тёплых и влажных воздушных масс североатлантического происхождения."
        ),
        FakeNews(
            "Снег, ледяные дожди и крупа накроют столичный регион",
            "МетеоВести",
            "09.11.2021",
            "Погода",
            "После ночной передышки ранним утром (06.00-09.00) 12 ноября в Москве ожидается интенсивный заряд снега (4,3 мм осадков, или 3,1 см снежного покрова) с кратковременным ухудшением видимости до 1500 метров. Температура воздуха около 0°.\n" +
                    "В окрестностях мегаполиса повысится вероятность слабого ледяного дождя, который в период с 00.00 до 03.00 местами пройдет в Угранском районе Смоленской области, Ясногорском районе Тульской области, Мосальском и Барятинском районах Калужской области, а к утру это опасное явление погоды доберется и до Подмосковья: в Одинцовском районе переохлажденные осадки накроют н.п. Немчиновка, Власиха, Одинцово, Заречье, в Ленинском районе – н.п. Говорово, (около 05.00), а также Серпуховский район (с 03.00 до 08.00)."
        ),
        FakeNews(
            "Как она попала в Беларусь?",
            "Онлайнер",
            "29.10.2021",
            "Авто",
            "Toyota Sprinter Trueno AE86 выпускалась с 1983 по 1987 год. Экземпляр Павла сошел с конвейера в Японии в 1986-м. По имеющейся у нас информации, данную Toyota еще в 1989 году купил один обеспеченный белорус. Машину ему доставил друг-моряк. Из префектуры Хоккайдо хетчбэк прилетел в Хабаровск на военном самолете. Дальнейший путь лежал по воде — автомобиль доставили до Клайпеды, откуда он попал на территорию Беларуси."
        ),
        FakeNews(
            "Индивидуальные , групповые туры- охоты, как для начинающих охотников, так и для опытных, желающих добыть достойный трофей",
            "Европарк",
            "01.02.2002",
            "Рыбалка",
            "Мы оказываем целый комплекс услуг по организации и проведению рыбалки на территории хозяйства, начиная с предоставления в аренду снастей заканчивая заморозкой улова. Также предусмотрено оказание дополнительных услуг для иностранных гостей."
        ),
        FakeNews(
            "Porsche запускает специальную серию моделей Panamera",
            "Онлайнер",
            "08.07.2020",
            "Авто",
            "Внешне новую линейку можно отличить по 21-дюймовым литым дискам Exclusive Design Sport в платиновом цвете, черным патрубкам выхлопной системы, тонированным задним стеклам, черной глянцевой окантовке боковых стекол и задним фонарям Exclusive Design."
        ),
        FakeNews(
            "Дом для деревьев, в котором также живут люди и птицы",
            "РеалтБай",
            "13.11.2021",
            "Недвижимость",
            "Бетонные высотки утомляют. Мы настолько привыкли к тому, что многоэтажки серые и унылые, что любой балкон, украшенный яркими петуниями или увитый цепким плющом, воспринимается как откровение: надо же, какая красота спряталась посреди скучных улиц. Но ведь «живыми» могут оказаться не только несколько окон на огромную «свечку», а целый дом! Озеленять многоэтажки архитекторы пытаются уже давно: понятно, что «фитофасады» пока серьезно уступают обычным, но кто знает, что принесет нам будущее и не начнут ли наши застройщики подобные эксперименты. Этой осенью Onlíner побывал в Милане и запечатлел самый «заросший» ЖК Италии. Как «устроены» столбики и тяжело ли поддерживать такую красоту — в нашем репортаже."
        ),
        FakeNews(
            "Проект нового ЖК на «Розочке» сильно изменился. Вот какие дома там построят в итоге",
            "РеалтБай",
            "09.10.2021",
            "Недвижимость",
            "В марте УКС «Запад» показал рендеры нового жилого комплекса, который планируется построить в районе пересечения улиц Розы Люксембург и Щорса. Тогда на картинках фигурировало пять панелек высотой от 6 до 10 этажей серии МАПИДа М-464-У1М. Однако выяснилось, что за полгода проект претерпел серьезные изменения. Уже сейчас на сайте застройщика размещены совсем другие эскизы. Как пояснили Onlíner представители УКСа, решение связано с тем, чтобы сделать комплекс интересней. Показываем, что в итоге здесь построят."
        ),
        FakeNews(
            "Открытый чемпионат Беларуси по плаванию на короткой воде проходит в Бресте",
            "Белта",
            "12.11.2021",
            "Спорт",
            "12 ноября, Минск /Корр. БЕЛТА/. В Бресте проходит открытый чемпионат Беларуси по плаванию на короткой воде. Турнир является квалификационным для выполнения нормативов отбора на чемпионат мира на короткой воде в Абу-Даби, который пройдет 16-21 декабря."
        ),
        FakeNews(
            "Появились изображения обновленного Hyundai Creta",
            "Онлайнер",
            "08.11.2021",
            "Авто",
            "Машина получит характерную решетку радиатора с хитро интегрированными ходовыми огнями. Называется этот дизайнерский элемент Parametric Jewel Hidden Lights. Второй блок головной оптики расположится этажом ниже. Пересмотрели дизайнеры и спорную заднюю часть. В салоне появится новый руль и большой экран мультимедийной системы. Технические подробности Creta для разных регионов опубликуют позже."
        ),
        FakeNews(
            "Молодежная сборная Беларуси по хоккею обыграла Данию на турнире в Латвии",
            "Белта",
            "12.11.2018",
            "Спорт",
            "Игра проходила с преимуществом белорусской \"молодежки\", игроки которой уже в первом периоде дважды огорчили соперников. На 23-й секунде матча отличился Александр Суворов, который завершил комбинацию, начатую Егором Юзленко и Виталием Пинчуком. На 18-й минуте удвоил преимущество команды Павла Перепехина Виталий Антонович, которому ассистировал Марк Ярута."
        ),
        FakeNews(
            "Игорь Тымонюк признан автором лучшего гола 28-го тура чемпионата Беларуси",
            "Белта",
            "18.06.2020",
            "Спорт",
            "За два тура до финиша нынешнего первенства футболисты \"Славии\" имеют в своем активе 28 очков и находятся на 14-м месте в турнирной таблице. Впереди \"Шахтер\", у которого 72 зачетных балла, второе место занимает борисовский БАТЭ, набравший 59 баллов, на один балл от борисовчан отстает минское \"Динамо\"."
        ),
        FakeNews(
            "О МЕСТАХ ДЛЯ РЫБАЛКИ",
            "Европарк",
            "08.06.1990",
            "Рыбалка",
            "На территории хозяйства EUROPARK расположен целый каскад озер – Синьша, Волобо , Глыбо, Ведето, Ножницы, Черное, Белое, течет река Дрисса. В  водоемах водится сом, судак, щука, окунь, лещ, угорь, красноперка, плотва, язь, густера, ёрш, голавль и жерех. Средняя глубина озер – 5-7 м, глубина зимовальных ям достигает 15-17 м. Берега твердые, лесистые, преобладают сосновые боры и березовые рощи. В озере Ведето водится редкая рыба селява.  Вода в водоемах кристально чистая."
        ),
        FakeNews(
            "ПРОВЕДЕНИЕ РЫБАЛКИ",
            "Европарк",
            "10.10.2000",
            "Рыбалка",
            "Отведать улов можно прямо в хозяйстве: наши профессиональные повара позаботятся о чистке и потрошении рыбы и приготовят блюда по вашему желанию. Также возможна заморозка улова для дальнейшей транспортировки."
        ),
        FakeNews(
            "ДОПОЛНИТЕЛЬНЫЕ УСЛУГИ",
            "Европарк",
            "09.05.1990",
            "Рыбалка",
            "Мы рады принимать в хозяйстве EUROPARK иностранных гостей. Нам приятно освобождать Вас от забот, связанных с приездом в другую страну и создавать для Вас максимально комфортные условия. Поэтому мы с удовольствием берем на себя следующие организационные моменты"
        ),
        FakeNews(
            "Как выбрать детское автокресло?",
            "Онлайнер",
            "12.11.2021",
            "Авто",
            "Существуют две стратегии. Первая — купить автолюльку, затем первое автокресло, потом кресло побольше. Вторая — сразу подобрать универсальную модель, так, чтобы от нуля и до подростковых истерик. Поспрашивали продавцов о том, какой путь лучше, и не услышали единого мнения. Одни настаивают, что каждому возрасту нужны свои адаптированные вещи, другие делают предположение, что такой подход выгоден в первую очередь производителям, но может быть тяжеловат для семейного бюджета."
        )
    )
}