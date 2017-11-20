package fr.eseo.dis.woodward.filmography.data;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rwoodward on 17/11/17.
 */

public class DummyData {

  private static List<Artiste> LIST_ARTISTE;
  private static List<Film> LIST_FILM;
  private static List<Role> LIST_ROLE;
  private static List<Pays> LIST_PAYS;
  private static List<Notation> LIST_NOTATION;
  private static List<Internaute> LIST_INTERNAUTE;
  private static Artiste[] ARTISTES = new Artiste[]{
      new Artiste(1, "COPPOLA", "SOFIA", 1971),
      new Artiste(2, "DUNST", "KIRSTEN", 1982),
      new Artiste(3, "HITCHCOCK", "ALFRED", 1899),
      new Artiste(4, "SCOTT", "RIDLEY", 1937),
      new Artiste(5, "WEAVER", "SIGOURNEY", 1949),
      new Artiste(6, "CAMERON", "JAMES", 1954),
      new Artiste(7, "FLEISCHER", "RICHARD", 1973),
      new Artiste(8, "HESTONE", "CHARLTON", 1923),
      new Artiste(9, "TARKOVSKI", "ANDREI", 1932),
      new Artiste(10, "WOO", "JOHN", 1946),
      new Artiste(11, "TRAVOLTA", "JOHN", 1954),
      new Artiste(12, "CAGE", "NICOLAS", 1964),
      new Artiste(13, "BURTON", "TIM", 1958),
      new Artiste(14, "DEPP", "JOHNNY", 1964),
      new Artiste(15, "STEWART", "JAMES", 1908),
      new Artiste(16, "NOVAK", "KIM", 1925),
      new Artiste(17, "MENDES", "SAM", 1965),
      new Artiste(18, "SPACEY", "KEVIN", 1959),
      new Artiste(19, "BENING", "ANETTE", 1958),
      new Artiste(20, "EASTWOOD", "CLINT", 1930),
      new Artiste(21, "HACKMAN", "GENE", 1930),
      new Artiste(22, "FREEMAN", "MORGAN", 1937),
      new Artiste(23, "CROWE", "RUSSELL", 1964),
      new Artiste(24, "FORD", "HARRISON", 1942),
      new Artiste(25, "HAUER", "RUTGER", 1944),
      new Artiste(26, "MCTIERMAN", "JOHN", 1951),
      new Artiste(27, "WILLIS", "BRUCE", 1955),
      new Artiste(28, "HARLIN", "RENNY", 1959),
      new Artiste(29, "PIALAT", "MAURICE", 1925),
      new Artiste(30, "DUTRONC", "JACQUES", 1943),
      new Artiste(31, "FINCHER", "DAVID", 1962),
      new Artiste(32, "PITT", "BRAD", 1963),
      new Artiste(33, "GILLIAM", "TERRY", 1940),
      new Artiste(34, "ANNAUD", "JEAN-JACQUES", 1943),
      new Artiste(35, "CONNERY", "SEAN", 1930),
      new Artiste(36, "SLATER", "CHRISTIAN", 1969),
      new Artiste(37, "TARANTINO", "QUENTIN", 1963),
      new Artiste(38, "JACKSON", "SAMUEL L.", 1948),
      new Artiste(39, "ARQUETTE", "ROSANNA", 1959),
      new Artiste(40, "THURMAN", "UMA", 1970),
      new Artiste(41, "FARRELLY", "BOBBY", 1958),
      new Artiste(42, "DIAZ", "CAMERON", 1972),
      new Artiste(43, "DILLON", "MAT", 1964),
      new Artiste(44, "SCHWARTZENEGGER", "ARNOLD", 1947),
      new Artiste(45, "SPIELBERG", "STEVEN", 1946),
      new Artiste(46, "SCHEIDER", "ROY", 1932),
      new Artiste(47, "SHAW", "ROBERT", 1927),
      new Artiste(48, "DREYFUS", "RICHARD", 1947),
      new Artiste(49, "DEMME", "JONATHAN", 1944),
      new Artiste(50, "HOPKINS", "ANTHONY", 1937),
      new Artiste(51, "FOSTER", "JODIE", 1960),
      new Artiste(53, "KILMER", "VAL", 1959),
      new Artiste(54, "FIENNES", "RALPH", 1962),
      new Artiste(55, "PFEIFFER", "MICHELLE", 1957),
      new Artiste(56, "BULLOCK", "SANDRA", 1964),
      new Artiste(57, "GOLDBLUM", "JEFF", 1952),
      new Artiste(58, "EMMERICH", "ROLAND", 1955),
      new Artiste(59, "BRODERICK", "MATTHEW", 1962),
      new Artiste(60, "RENO", "JEAN", 1948),
      new Artiste(61, "WACHOWSKI", "ANDY", 1967),
      new Artiste(62, "REEVES", "KEANU", 1964),
      new Artiste(63, "FISHBURNE", "LAURENCE", 1961),
      new Artiste(64, "DE PALMA", "BRIAN", 1940),
      new Artiste(65, "CRUISE", "TOM", 1962),
      new Artiste(66, "VOIGHT", "JOHN", 1938),
      new Artiste(67, "BART", "EMMANUELLE", 1965),
      new Artiste(68, "KUROZAWA", "AKIRA", 1910),
      new Artiste(69, "HARRIS", "ED", 1950),
      new Artiste(70, "LINNEY", "LAURA", 1964),
      new Artiste(71, "GIRAULT", "JEAN", 1924),
      new Artiste(72, "DE FUNS", "LOUIS", 1914),
      new Artiste(73, "GALABRU", "MICHEL", 1922),
      new Artiste(75, "BALASKO", "JOSIANE", 1950),
      new Artiste(76, "LAVANANT", "DOMINIQUE", 1944),
      new Artiste(77, "LANVIN", "GRARD", 1950),
      new Artiste(78, "VILLERET", "JACQUES", 1951),
      new Artiste(79, "LEVINSON", "BARRY", 1942),
      new Artiste(80, "HOFFMAN", "DUSTIN", 1937),
      new Artiste(81, "SCOTT", "TONY", 1944),
      new Artiste(82, "MCGILLIS", "KELLY", 1957),
      new Artiste(83, "LECONTE", "PATRICE", 1947),
      new Artiste(84, "BLANC", "MICHEL", 1952),
      new Artiste(85, "CLAVIER", "CHRISTIAN", 1952),
      new Artiste(86, "LHERMITE", "THIERRY", 1952),
      new Artiste(88, "PERKINS", "ANTHONY", 1932),
      new Artiste(89, "MILES", "VERA", 1929),
      new Artiste(90, "LEIGH", "JANET", 1927),
      new Artiste(91, "MARQUAND", "RICHARD", 1938),
      new Artiste(92, "HAMILL", "MARK", 1951),
      new Artiste(93, "FISHER", "CARRIE", 1956),
      new Artiste(94, "TAYLOR", "ROD", 1930),
      new Artiste(95, "HEDREN", "TIPPI", 1931),
      new Artiste(96, "RICCI", "CHRISTINA", 1980),
      new Artiste(97, "WALKEN", "CHRISTOPHER", 1943),
      new Artiste(98, "KEITEL", "HARVEY", 1939),
      new Artiste(99, "ROTH", "TIM", 1961),
      new Artiste(100, "PENN", "CHRIS", 1966),
      new Artiste(101, "KUBRICK", "STANLEY", 1928),
      new Artiste(102, "KIDMAN", "NICOLE", 1967),
      new Artiste(103, "NICHOLSON", "JACK", 1937),
      new Artiste(104, "KELLY", "GRACE", 1929),
      new Artiste(105, "GRANT", "CARY", 1904),
      new Artiste(106, "SAINT", "EVA MARIE", 1924),
      new Artiste(107, "MASON", "JAMES", 1909),
      new Artiste(109, "WINSLET", "KATE", 1975),
      new Artiste(110, "DICAPRIO", "LEONARDO", 1974),
      new Artiste(111, "BESSON", "LUC", 1959),
      new Artiste(112, "JOVOVICH", "MILLA", 1975),
      new Artiste(113, "DUNAWAY", "FANE", 1941),
      new Artiste(114, "MALKOVITCH", "JOHN", 1953),
      new Artiste(115, "KARYO", "TCHKY", 1953),
      new Artiste(116, "OLDMAN", "GARY", 1958),
      new Artiste(117, "HOLM", "IAN", 1931),
      new Artiste(118, "PORTMAN", "NATALIE", 1981),
      new Artiste(119, "PARILLAUD", "ANNE", 1960),
      new Artiste(120, "ANGLADE", "JEAN-HUGHES", 1955),
      new Artiste(121, "BARR", "JEAN-MARC", 1960),
      new Artiste(122, "FERRARA", "ABEL", 1951),
      new Artiste(123, "CARUSO", "DAVID", 1956),
      new Artiste(124, "SNIPES", "WESLEY", 1962),
      new Artiste(125, "SCIORA", "ANNABELLA", 1964),
      new Artiste(126, "ROSSELINI", "ISABELLA", 1952),
      new Artiste(127, "GALLO", "VINCENT", 1961),
      new Artiste(128, "VON TRIER", "LARS", 1956),
      new Artiste(129, "GUDMUNDSDOTTIR", "BJORK", 1965),
      new Artiste(130, "DENEUVE", "CATHERINE", 1943),
      new Artiste(131, "KASSOWITZ", "MATTHIEU", 1967),
      new Artiste(132, "CASSEL", "VINCENT", 1966),
      new Artiste(133, "GRAY", "JAMES", 1969),
      new Artiste(134, "WAHLBERG", "MARK", 1971),
      new Artiste(135, "PHOENIX", "JOAQUIN", 1974),
      new Artiste(136, "THERON", "CHARLIZE", 1975),
      new Artiste(137, "CAAN", "JAMES", 1940),
      new Artiste(138, "CHABROL", "CLAUDE", 1930),
      new Artiste(139, "HUPPERT", "ISABELLE", 1953),
      new Artiste(140, "MOUGLALIS", "ANNA", 1978),
      new Artiste(141, "COSTNER", "KEVIN", 1955),
      new Artiste(142, "DERN", "LAURA", 1967),
      new Artiste(143, "HANKS", "TOM", 1956),
      new Artiste(144, "SIZEMORE", "TOM", 1964),
      new Artiste(145, "DAMON", "MATT", 1970),
      new Artiste(146, "MODINE", "MATTHEW", 1959),
      new Artiste(147, "BALDWIN", "ADAM", 1962),
      new Artiste(148, "O'NEAL", "RYAN", 1941),
      new Artiste(149, "BERENSON", "MARISA", 1946),
      new Artiste(150, "MCDOWELL", "MACOLM", 1943),
      new Artiste(151, "DULLEA", "KEIR", 1936),
      new Artiste(152, "LOCKWOOD", "GARY", 1937),
      new Artiste(153, "SELLERS", "PETER", 1925),
      new Artiste(154, "SCOTT", "GEORGE", 1927),
      new Artiste(155, "HAYDEN", "STERLING", 1916),
      new Artiste(156, "DOUGLAS", "KIRK", 1916),
      new Artiste(157, "DONAT", "ROBERT", 1905),
      new Artiste(158, "CAROLL", "MADELEINE", 1906),
      new Artiste(159, "OLIVIER", "LAURENCE", 1907),
      new Artiste(160, "FONTAINE", "JOAN", 1917),
      new Artiste(161, "SANDERS", "GEORGE", 1906),
      new Artiste(162, "BERGMAN", "INGRID", 1915),
      new Artiste(163, "RAINS", "CLAUDE", 1889),
      new Artiste(164, "MILLAND", "RAY", 1907),
      new Artiste(166, "DAY", "DORIS", 1924),
      new Artiste(167, "DE NIRO", "ROBERT", 1943),
      new Artiste(168, "GRIER", "PAM", 1949),
      new Artiste(169, "FONDA", "BRIDGET", 1964),
      new Artiste(170, "KEATON", "MICHAEL", 1951),
      new Artiste(171, "SHYAMALAN", "M. NIGHT", 1970),
      new Artiste(172, "OSMENT", "HALEY JOEL", 1988),
      new Artiste(173, "COLLETTE", "TONY", 1972),
      new Artiste(174, "LEIGHTON", "ERIC", 1962),
      new Artiste(175, "MANN", "MICHAEL", 1943),
      new Artiste(176, "PACINO", "AL", 1940),
      new Artiste(177, "CROWE", "RUSSEL", 1964),
      new Artiste(178, "PLUMMER", "CHRISTOPHER", 1927),
      new Artiste(179, "FURLONG", "EDWARD", 1977),
      new Artiste(180, "REDGRAVE", "VANESSA", 1937),
      new Artiste(181, "COPPOLA", "FRANCIS FORD", 1940),
      new Artiste(182, "BRANDO", "MARLON", 1924),
      new Artiste(183, "KEATON", "DIANE", 1946),
      new Artiste(184, "DUVALL", "ROBERT", 1931),
      new Artiste(185, "CAAN", "JAMEES", 1939),
      new Artiste(186, "GARCIA", "ANDY", 1956),
      new Artiste(187, "RAIMI", "SAM", 1959),
      new Artiste(188, "MAGUIRE", "TOBEY", 1975),
      new Artiste(210, "MOSS", "CARRIE-ANNE", 1967),
      new Artiste(211, "WEAVING", "HUGO", 1960),
      new Artiste(212, "JACKSON", "SAMUEL", 1948),
      new Artiste(213, "LIU", "LUCY", 1968),
      new Artiste(214, "CARRADINE", "DAVID", 1936),
      new Artiste(215, "MADSEN", "MICHAEL", 1958),
      new Artiste(216, "HANNAH", "DARYL", 1960),
      new Artiste(217, "BUSCEMI", "STEVE", 1957),
      new Artiste(218, "BUNKER", "EDWARD", 1933),
      new Artiste(219, "LEONE", "SERGIO", 1929),
      new Artiste(220, "VAN CLEEF", "LEE", 1925),
      new Artiste(221, "VOLONTE", "GIAN MARIA", 1933),
      new Artiste(224, "SWANK", "HILLARY", 1974),
      new Artiste(241, "SCORCESE", "MARTIN", 1962),
      new Artiste(242, "LIOTTA", "RAY", 1954),
      new Artiste(243, "PESCI", "JOE", 1943),
      new Artiste(244, "BRACCO", "LORRAINE", 1954),
      new Artiste(245, "STONE", "SHARON", 1958),
      new Artiste(246, "CAMPBELL", "MARTIN", 1943),
      new Artiste(247, "CRAIG", "DANIEL", 1968),
      new Artiste(248, "GREEN", "EVA", 1980),
      new Artiste(249, "BENCH", "JUDI", 1934),
      new Artiste(250, "BARDEM", "JAVIER", 1969),
      new Artiste(251, "COEN", "ETHAN", 1957),
      new Artiste(252, "JONES", "TOMMY LEE", 1946),
      new Artiste(253, "BROLIN", "JOSH", 1968),
      new Artiste(254, "MACY", "WILLIAM", 1950),
      new Artiste(255, "FOXX", "JAMIE", 1967),
      new Artiste(256, "WALTZ", "CHRISTOPH", 1956),
      new Artiste(257, "LAURENT", "MÉLANIE", 1983),
      new Artiste(258, "FASSBENDER", "MICHAEL", 1977),
      new Artiste(259, "TRUFFAUT", "FRANÇOIS", 1932),
      new Artiste(260, "LÉAUD", "JEAN-PIERRE", 1944),
      new Artiste(261, "DEPARTIEU", "GÉRARD", 1948),
      new Artiste(262, "POIRET", "JEAN", 1926),
      new Artiste(263, "FORD", "JOHN", 1894),
      new Artiste(264, "WAYNE", "JOHN", 1907),
      new Artiste(265, "O'HARA", "MAUREEN", 1920),
      new Artiste(266, "NOLAN", "CHRISTOPHER", 1970),
      new Artiste(267, "MCCONAUGHEY", "MATHEW", 1969),
      new Artiste(268, "HATHAWAY", "ANNE", 1982),
      new Artiste(269, "CAINE", "MICHAEL", 1933),
      new Artiste(270, "PAGE", "ELEN", 1987),
      new Artiste(271, "COTILLARD", "MARION", 1975),
      new Artiste(272, "PEARCE", "GUY", 1967),
      new Artiste(273, "MOSS", "CARIE-ANNE", 1967),
      new Artiste(274, "BALE", "CHRISTIAN", 1974),
      new Artiste(275, "NEESON", "LIAM", 1952),
      new Artiste(276, "LEDGER", "HEATH", 1979),
      new Artiste(277, "GYLLENHAAL", "MAGGIE", 1977),
      new Artiste(278, "AUDIARD", "JACQUES", 1952),
      new Artiste(279, "RAHIM", "TAHAR", 1981),
      new Artiste(280, "ARESTRUP", "NIELS", 1949),
      new Artiste(281, "KHEIRON", "TABIB", 1982),
      new Artiste(282, "JONES", "TERRY", 1942),
      new Artiste(283, "CLEESE", "JOHN", 1939),
      new Artiste(284, "IDLE", "ERIC", 1943),
      new Artiste(285, "PALIN", "MICHAEL", 1943),
      new Artiste(286, "CHAPMAN", "GRAHAM", 1941)
  };
  private static Internaute[] INTERNAUTES = new Internaute[]{
      new Internaute("mreynder@free.fr", "Reynder", "Miroslav", "Bretagne", 1980),
      new Internaute("jwerner@free.fr", "Werner", "Johan", "Ile-de-France", 1974),
      new Internaute("gsitz@yahoo.fr", "Sitz", "Georgeanna", "Languedoc-Roussillon-Midi-Pyrénées",
          1967),
      new Internaute("dzdunowski@eseo.fr", "Zdunowski", "Damian", "Ile-de-France", 1980),
      new Internaute("lsimonsen@free.fr", "Simonsen", "Lin", "Provence-Alpes-Côte d'Azur", 1965),
      new Internaute("folant.kiss@shu.ac.uk", "Kiss", "Folant",
          "Languedoc-Roussillon-Midi-Pyrénées", 1999),
      new Internaute("kyriakos.agterop@gmail.com", "Agterop", "Kyriakos", "Bretagne", 1983),
      new Internaute("aco.beckham@gmail.com", "Beckham", "Aco", "Nord-Pas-de-Calais-Picardie",
          1993),
      new Internaute("mgonzales@yahoo.fr", "Gonzales", "Monifa", "Nord-Pas-de-Calais-Picardie",
          1998),
      new Internaute("kayleah.tisza@eseo.fr", "Tisza", "Kayleah", "Provence-Alpes-Côte d'Azur",
          1969),
      new Internaute("silvijo.altamura@eseo.fr", "Altamura", "Silvijo", "Pays de la loire", 1995),
      new Internaute("brijnders@shu.ac.uk", "Rijnders", "Beniamin", "Ile-de-France", 1969),
      new Internaute("derror@shu.ac.uk", "Error", "Doruk", "Ile-de-France", 1968),
      new Internaute("dludvigsen@yahoo.fr", "Ludvigsen", "Doria", "Pays de la loire", 1987),
      new Internaute("stipo.schultes@gmail.com", "Schultes", "Stipo", "Bretagne", 1969),
      new Internaute("kcoelho@shu.ac.uk", "Coelho", "Katja", "Bretagne", 1964),
      new Internaute("mfrank@eseo.fr", "Frank", "Meri", "Pays de la loire", 1967),
      new Internaute("hschmid@eseo.fr", "Schmid", "Heino", "Pays de la loire", 1970),
      new Internaute("jeinarsson@yahoo.fr", "Einarsson", "Jorunn", "Auvergne-Rhône-Alpes", 1987),
  };
  private static Pays[] PAYS = new Pays[]{
      new Pays("DE", "Allemagne", "Allemand"),
      new Pays("FR", "France", "Français"),
      new Pays("GB", "Royaume-Uni", "Anglais"),
      new Pays("IT", "Italie", "Italien"),
      new Pays("JP", "Japon", "Japonais"),
      new Pays("USA", "Etats Unis", "Anglais"),
      new Pays("is", "Islande", "Islandais"),
      new Pays("ru", "Russie", "Russe"),
  };
  private static Film[] FILMS = new Film[]{
      new Film(1, "Vertigo", 1958, 3, "Drame",
          "Scottie Ferguson, ancien inspecteur de police, est sujet au vertige depuis qu'il a vu mourir son collègue. Elster, son ami, le charge de surveiller sa femme, Madeleine, ayant des tendances suicidaires. Amoureux de la jeune femme Scottie ne remarque pas le piège qui se trame autour de lui et dont il va être la victime...",
          "USA"),
      new Film(2, "Alien", 1979, 4, "Science-fiction",
          "Près d'un vaisseau spatial échoué sur une lointaine planète, des Terriens en mission découvrent de bien étranges oeufs. Ils en ramènent un à bord, ignorant qu'ils viennent d'introduire parmi eux un huitième passager particulièrement féroce et meurtrier.",
          "USA"),
      new Film(3, "Titanic", 1997, 6, "Drame",
          "Conduite par Brock Lovett, une expédition américaine fouillant l'épave du Titanic remonte à la surface le croquis d'une femme nue. Alertée par les médias la dame en question, Rose DeWitt Bukater, aujourd'hui centenaire, rejoint les lieux du naufrage, d'où elle entreprend de conter le récit de son fascinant, étrange et tragique voyage...",
          "USA"),
      new Film(4, "Sacrifice", 1986, 9, "Drame", "", "FR"),
      new Film(5, "Volte/Face", 1997, 10, "Action",
          "Directeur d'une unité anti-terroriste, Sean Archer recherche Castor Troy, un criminel responsable de la mort de son fils six ans plus tôt. Il parvient à l'arrêter mais apprend que Troy a caché une bombe au Palais des Congrès de Los Angeles. Seul le frère de Troy peut la désamorcer et, pour l'approcher, Archer se fait greffer le visage de Troy.",
          "USA"),
      new Film(6, "Sleepy Hollow", 1999, 13, "Fantastique",
          "Nouvelle Angleterre, 1799. A Sleepy Hollow, plusieurs cadavres sont retrouvés décapités. La rumeur attribue ces meurtres à un cavalier lui-même sans tête. Mais le fin limier new-yorkais Ichabod Crane ne croit pas en ses aberrations. Tombé sous le charme de la vénéneuse Katrina, il mène son enquête au coeur des sortilèges de Sleepy Hollow..",
          "USA"),
      new Film(7, "American Beauty", 1999, 17, "Comédie",
          "Lester Burnham, sa femme Carolyn et leur fille Jane mènent apparemment une vie des plus heureuses dans leur belle banlieue. Mais derrière cette respectable façade se tisse une étrange et grinçante tragi-comédie familiale où désirs inavoués, frustrations et violences refoulées conduiront inexorablement un homme vers la mort.",
          "USA"),
      new Film(8, "Impitoyable", 1992, 20, "Western",
          "Légendaire hors-la-loi, William Munny s'est reconverti depuis onze ans en paisible fermier. Il reprend néanmoins les armes pour traquer deux tueurs en compagnie de son vieil ami Ned Logan. Mais ce dernier est capturé, puis éxécute. l'honneur et l'amitié imposent dès lors à Munny de redevenir une dernière fois le héros qu'il fut jadis...",
          "USA"),
      new Film(9, "Gladiator", 2000, 4, "Drame",
          "Le général romain Maximus est le plus fidèle soutien de l'empereur Marc Aurèle, qu'il a conduit de victoire en victoire avec une bravoure et un dévouement exemplaires. Jaloux du prestige de Maximus, et plus encore de l'amour que lui voue l'empereur, le fils de Marc-Aurèle, Commode, s'arroge brutalement le pouvoir, puis ordonne l'arrestation du général et son exécution. Maximus échappe à ses assassins mais ne peut empêcher le massacre de sa famille. Capturé par un marchand d'esclaves, il devient gladiateur et prépare sa vengeance.",
          "USA"),
      new Film(10, "Blade Runner", 1982, 4, "Action",
          "En 2019, lors de la décadence de Los Angeles, des êtres synthétiques, sans pensée, sans émotions, suffisent aux différents travaux d'entretien. Leur durée de vie n'excède pas 4 années. Un jour, ces ombres humaines se révoltent et on charge les tueurs, appelés Blade Runner, de les abattre...",
          "USA"),
      new Film(11, "Piège de cristal", 1988, 26, "Action",
          "John Mc Clane, policier new-yorkais, vient passer Noel a Los Angeles aupres de sa femme. Dans le building ou elle travaille, il se retrouve temoin de la prise en otage de tout le personnel par 12 terroristes. Objectif de ces derniers, vider les coffres de la societe. Cache mais isole, il entreprend de prevenir l'exterieur...",
          "USA"),
      new Film(12, "58 minutes pour vivre", 1990, 28, "Action",
          "Venu attendre sa femme a l'aéroport, le policier John McClane remarque la présence de terroristes qui ont pris le contrôle des pistes, empêchant tout avion d'atterrir et menaçant de laisser les appareils en vol tourner jusqu'à épuisement de leur kérosène. John n'a devant lui que 58 minutes pour éviter la catastrophe...",
          "USA"),
      new Film(13, "Van Gogh", 1990, 29, "Drame",
          "Les derniers jours de la vie de Vincent Van Gogh, réfugié à Auvers-sur-Oise, près de chez son ami et protecteur le docteur Gachet, un ami de son frère Théo. Ce peintre maudit, que les villageois surnommaient le fou, n'avait alors plus que deux mois à vivre, qu'il passa en peignant un tableau par jour.",
          "FR"),
      new Film(14, "Seven", 1995, 31, "Policier",
          "A New York, un criminel anonyme a décidé de commettre 7 meurtres basés sur les 7 pêchés capitaux énoncés dans la Bible : gourmandise, avarice, paresse, orgueil, luxure, envie et colère. Vieux flic blasé à 7 jours de la retraite, l'inspecteur Somerset mène l'enquête tout en formant son remplaçant, l'ambitieux inspecteur David Mills...",
          "USA"),
      new Film(15, "l'armée des douze singes", 1995, 33, "Science-fiction", "", "USA"),
      new Film(16, "Le nom de la rose", 1986, 34, "Policier",
          "En l'an 1327, dans une abbaye bénédictine, le moine franciscain Guillaume de Baskerville, accompagné de son jeune novice Adso, enquête sur de mystérieuses morts qui frappent la confrérie. Le secret semble résider dans la bibliothèque, où le vieux Jorge garde jalousement un livre jugé maudit.",
          "FR"),
      new Film(17, "Pulp fiction", 1994, 37, "Action",
          "Pulp Fiction décrit l'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood, ou s'entrecroisent les destins de deux petits tueurs, d'un dangereux gangster marié à une camée, d'un boxeur roublard, de prêteurs sur gages sadiques, d'un caïd élégant et dévoué, d'un dealer bon mari et de deux tourtereaux à la gachette facile...",
          "USA"),
      new Film(18, "Mary à tout prix", 1998, 41, "Comédie",
          "Pour retrouver l'amour de sa jeunesse, la belle Mary, Ted-le-looser engage Pat Healy, un privé. Subjugé par la jeune femme, ce dernier tente de la séduire en se faisant passer pour un architecte. Il cache la vérité à Ted et fait cause commune avec Tucker, un autre prétendant, pour se débarrasser de l'encombrant Ted...",
          "USA"),
      new Film(19, "Terminator", 1984, 6, "Science-fiction",
          "Deux creatures venues du futur debarquent sur terre. L'une d'entre elles, le Terminator, doit eliminer une certaine Sarah Connor, qui doit enfanter celui qui sera le chef d'un groupe de resistants. L'autre, Kyle Reese, est charge par les rebelles de defendre Sarah...",
          "USA"),
      new Film(20, "Les dents de la mer", 1975, 45, "Horreur",
          "Dans la station balnéaire d'Amityville, un requin géant frappe à plusieurs reprises. Soucieux d'une bonne saison touristique, le maire interdit au sherif Brody de fermer les plages. Une prime est offerte et le célèbre chasseur de requin Quint se lance avec Brody et l'ichtyologue Hooper à la poursuite du monstre...",
          "FR"),
      new Film(21, "Monty Python and the Holy Grail", 1975, 33, "Comédie",
          "Le roi Arthur et les Chevaliers de la Table Ronde se lancent à la conquête du Graal, chevauchant de fantômatiques montures dans un bruitage de noix de coco cognées. La petite troupe va devoir passer mille épreuves, dont un chevalier à trois têtes, des jouvencelles en chaleur, voire même un terrible lapin tueur.",
          "GB")
  };
  private static Role[] ROLES = new Role[]{
      new Role(1, 16, "Madeleine Elster"),
      new Role(2, 5, "Ripley"),
      new Role(5, 11, "Sean Archer/Castor Troy"),
      new Role(5, 12, "Castor Troy/Sean Archer"),
      new Role(6, 14, "Constable Ichabod Crane"),
      new Role(7, 18, "Lester Burnham"),
      new Role(7, 19, "Carolyn Burnham"),
      new Role(8, 20, "William Munny"),
      new Role(14, 18, "Doe"),
      new Role(17, 11, "Vincent Vega"),
      new Role(21, 33, "Patsy"),
      new Role(21, 282, "Sir Bedevere the Wise"),
      new Role(21, 283, "Sir Lancelot the Brave"),
      new Role(21, 284, "Sir Robin the Not-Quite-So-Brave-as-Sir-Lancelot"),
      new Role(21, 285, "Sir Galahad the Pure"),
      new Role(21, 286, "Arthur, King of the Britons"),
  };
  private static Notation[] NOTATIONS = new Notation[]{
      new Notation(10, "mreynder@free.fr", 4),
      new Notation(11, "mreynder@free.fr", 2),
      new Notation(15, "mreynder@free.fr", 4),
      new Notation(16, "mreynder@free.fr", 5),
      new Notation(17, "mreynder@free.fr", 3),
      new Notation(19, "mreynder@free.fr", 3),
      new Notation(1, "jwerner@free.fr", 2),
      new Notation(4, "jwerner@free.fr", 1),
      new Notation(5, "jwerner@free.fr", 4),
      new Notation(6, "jwerner@free.fr", 4),
      new Notation(7, "jwerner@free.fr", 4),
      new Notation(10, "jwerner@free.fr", 4),
      new Notation(14, "jwerner@free.fr", 2),
      new Notation(19, "jwerner@free.fr", 3),
      new Notation(20, "jwerner@free.fr", 4),
      new Notation(1, "gsitz@yahoo.fr", 5),
      new Notation(2, "gsitz@yahoo.fr", 4),
      new Notation(6, "gsitz@yahoo.fr", 4),
      new Notation(7, "gsitz@yahoo.fr", 4),
      new Notation(8, "gsitz@yahoo.fr", 4),
      new Notation(10, "gsitz@yahoo.fr", 5),
      new Notation(11, "gsitz@yahoo.fr", 5),
      new Notation(12, "gsitz@yahoo.fr", 5),
      new Notation(14, "gsitz@yahoo.fr", 4),
      new Notation(16, "gsitz@yahoo.fr", 4),
      new Notation(17, "gsitz@yahoo.fr", 5),
      new Notation(18, "gsitz@yahoo.fr", 2),
      new Notation(19, "gsitz@yahoo.fr", 5),
      new Notation(5, "dzdunowski@eseo.fr", 2),
      new Notation(10, "dzdunowski@eseo.fr", 4),
      new Notation(2, "lsimonsen@free.fr", 5),
      new Notation(3, "lsimonsen@free.fr", 3),
      new Notation(6, "lsimonsen@free.fr", 2),
      new Notation(9, "lsimonsen@free.fr", 5),
      new Notation(10, "lsimonsen@free.fr", 2),
      new Notation(11, "lsimonsen@free.fr", 3),
      new Notation(12, "lsimonsen@free.fr", 4),
      new Notation(15, "lsimonsen@free.fr", 4),
      new Notation(17, "lsimonsen@free.fr", 2),
      new Notation(18, "lsimonsen@free.fr", 4),
      new Notation(19, "lsimonsen@free.fr", 3),
      new Notation(20, "lsimonsen@free.fr", 3),
      new Notation(1, "folant.kiss@shu.ac.uk", 4),
      new Notation(2, "folant.kiss@shu.ac.uk", 2),
      new Notation(3, "folant.kiss@shu.ac.uk", 1),
      new Notation(4, "folant.kiss@shu.ac.uk", 5),
      new Notation(5, "folant.kiss@shu.ac.uk", 4),
      new Notation(6, "folant.kiss@shu.ac.uk", 0),
      new Notation(7, "folant.kiss@shu.ac.uk", 3),
      new Notation(8, "folant.kiss@shu.ac.uk", 3),
      new Notation(9, "folant.kiss@shu.ac.uk", 3),
      new Notation(10, "folant.kiss@shu.ac.uk", 4),
      new Notation(11, "folant.kiss@shu.ac.uk", 5),
      new Notation(12, "folant.kiss@shu.ac.uk", 2),
      new Notation(13, "folant.kiss@shu.ac.uk", 5),
      new Notation(14, "folant.kiss@shu.ac.uk", 3),
      new Notation(15, "folant.kiss@shu.ac.uk", 4),
      new Notation(16, "folant.kiss@shu.ac.uk", 3),
      new Notation(17, "folant.kiss@shu.ac.uk", 4),
      new Notation(18, "folant.kiss@shu.ac.uk", 3),
      new Notation(19, "folant.kiss@shu.ac.uk", 2),
      new Notation(20, "folant.kiss@shu.ac.uk", 4),
      new Notation(1, "kyriakos.agterop@gmail.com", 3),
      new Notation(2, "kyriakos.agterop@gmail.com", 2),
      new Notation(3, "kyriakos.agterop@gmail.com", 3),
      new Notation(5, "kyriakos.agterop@gmail.com", 3),
      new Notation(20, "kyriakos.agterop@gmail.com", 2),
      new Notation(16, "aco.beckham@gmail.com", 4),
      new Notation(17, "aco.beckham@gmail.com", 4),
      new Notation(5, "mgonzales@yahoo.fr", 1),
      new Notation(10, "mgonzales@yahoo.fr", 5),
      new Notation(11, "mgonzales@yahoo.fr", 4),
      new Notation(1, "kayleah.tisza@eseo.fr", 4),
      new Notation(2, "kayleah.tisza@eseo.fr", 5),
      new Notation(3, "kayleah.tisza@eseo.fr", 3),
      new Notation(5, "kayleah.tisza@eseo.fr", 1),
      new Notation(7, "kayleah.tisza@eseo.fr", 5),
      new Notation(8, "kayleah.tisza@eseo.fr", 5),
      new Notation(9, "kayleah.tisza@eseo.fr", 4),
      new Notation(10, "kayleah.tisza@eseo.fr", 5),
      new Notation(11, "kayleah.tisza@eseo.fr", 3),
      new Notation(12, "kayleah.tisza@eseo.fr", 3),
      new Notation(14, "kayleah.tisza@eseo.fr", 5),
      new Notation(15, "kayleah.tisza@eseo.fr", 4),
      new Notation(16, "kayleah.tisza@eseo.fr", 5),
      new Notation(17, "kayleah.tisza@eseo.fr", 4),
      new Notation(18, "kayleah.tisza@eseo.fr", 3),
      new Notation(19, "kayleah.tisza@eseo.fr", 4),
      new Notation(20, "kayleah.tisza@eseo.fr", 5),
      new Notation(5, "silvijo.altamura@eseo.fr", 2),
      new Notation(1, "brijnders@shu.ac.uk", 5),
      new Notation(2, "brijnders@shu.ac.uk", 1),
      new Notation(3, "brijnders@shu.ac.uk", 1),
      new Notation(4, "brijnders@shu.ac.uk", 4),
      new Notation(5, "brijnders@shu.ac.uk", 2),
      new Notation(8, "brijnders@shu.ac.uk", 4),
      new Notation(9, "brijnders@shu.ac.uk", 3),
      new Notation(10, "brijnders@shu.ac.uk", 4),
      new Notation(1, "derror@shu.ac.uk", 0),
      new Notation(2, "derror@shu.ac.uk", 0),
      new Notation(3, "derror@shu.ac.uk", 0),
      new Notation(5, "derror@shu.ac.uk", 0),
      new Notation(6, "derror@shu.ac.uk", 1),
      new Notation(7, "derror@shu.ac.uk", 3),
      new Notation(8, "derror@shu.ac.uk", 4),
      new Notation(9, "derror@shu.ac.uk", 1),
      new Notation(10, "derror@shu.ac.uk", 4),
      new Notation(11, "derror@shu.ac.uk", 5),
      new Notation(12, "derror@shu.ac.uk", 1),
      new Notation(17, "derror@shu.ac.uk", 1),
      new Notation(2, "dludvigsen@yahoo.fr", 5),
      new Notation(3, "dludvigsen@yahoo.fr", 5),
      new Notation(13, "dludvigsen@yahoo.fr", 4),
      new Notation(14, "dludvigsen@yahoo.fr", 3),
      new Notation(19, "dludvigsen@yahoo.fr", 2),
      new Notation(20, "dludvigsen@yahoo.fr", 4),
      new Notation(1, "stipo.schultes@gmail.com", 5),
      new Notation(2, "stipo.schultes@gmail.com", 2),
      new Notation(3, "stipo.schultes@gmail.com", 2),
      new Notation(4, "stipo.schultes@gmail.com", 2),
      new Notation(6, "stipo.schultes@gmail.com", 5),
      new Notation(7, "stipo.schultes@gmail.com", 3),
      new Notation(8, "stipo.schultes@gmail.com", 2),
      new Notation(9, "stipo.schultes@gmail.com", 5),
      new Notation(10, "stipo.schultes@gmail.com", 2),
      new Notation(14, "stipo.schultes@gmail.com", 4),
      new Notation(1, "kcoelho@shu.ac.uk", 5),
      new Notation(2, "kcoelho@shu.ac.uk", 5),
      new Notation(3, "kcoelho@shu.ac.uk", 4),
      new Notation(5, "kcoelho@shu.ac.uk", 4),
      new Notation(5, "mfrank@eseo.fr", 2),
      new Notation(7, "mfrank@eseo.fr", 5),
      new Notation(10, "mfrank@eseo.fr", 3),
      new Notation(11, "mfrank@eseo.fr", 5),
      new Notation(12, "mfrank@eseo.fr", 3),
      new Notation(17, "mfrank@eseo.fr", 1),
      new Notation(18, "mfrank@eseo.fr", 3),
      new Notation(2, "hschmid@eseo.fr", 5),
      new Notation(3, "hschmid@eseo.fr", 3),
      new Notation(5, "hschmid@eseo.fr", 3),
      new Notation(6, "hschmid@eseo.fr", 5),
      new Notation(7, "hschmid@eseo.fr", 5),
      new Notation(9, "hschmid@eseo.fr", 5),
      new Notation(10, "hschmid@eseo.fr", 5),
      new Notation(11, "hschmid@eseo.fr", 3),
      new Notation(12, "hschmid@eseo.fr", 3),
      new Notation(15, "hschmid@eseo.fr", 4),
      new Notation(17, "hschmid@eseo.fr", 3),
      new Notation(18, "hschmid@eseo.fr", 5),
      new Notation(19, "hschmid@eseo.fr", 5),
      new Notation(20, "hschmid@eseo.fr", 4),
  };

  private DummyData() {
  }

  public static List<Artiste> getArtistes() {
    if (LIST_ARTISTE == null) {
      LIST_ARTISTE = Arrays.asList(ARTISTES);
    }
    return LIST_ARTISTE;
  }

  public static List<Film> getFilms() {
    if (LIST_FILM == null) {
      LIST_FILM = Arrays.asList(FILMS);
    }
    return LIST_FILM;
  }

  public static List<Internaute> getInternaute() {
    if (LIST_INTERNAUTE == null) {
      LIST_INTERNAUTE = Arrays.asList(INTERNAUTES);
    }
    return LIST_INTERNAUTE;
  }

  public static List<Notation> getNotations() {
    if (LIST_NOTATION == null) {
      LIST_NOTATION = Arrays.asList(NOTATIONS);
    }
    return LIST_NOTATION;
  }

  public static List<Pays> getPays() {
    if (LIST_PAYS == null) {
      LIST_PAYS = Arrays.asList(PAYS);
    }
    return LIST_PAYS;
  }

  public static List<Role> getRoles() {
    if (LIST_ROLE == null) {
      LIST_ROLE = Arrays.asList(ROLES);
    }
    return LIST_ROLE;
  }
}
