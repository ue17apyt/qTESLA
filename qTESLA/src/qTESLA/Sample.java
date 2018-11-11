package qTESLA;

import java.util.Arrays;

public class Sample {

	public static final double[][] EXPONENTIAL_DISTRIBUTION_I = {
			/* [3][32] */
			{ 
				1.0000000000000000000000000000000000000000,		0.9990496327075997720621566739241504871513,
				0.9981001686131900082646604498429491608001,		0.9971516068584008799087793737854343387385,
				0.9962039465856783249057599531380206128030,		0.9952571869382832724989228009014122394200,
				0.9943113270602908687225570427678069689363, 	0.9933663660965897025969132575731249565771,
				0.9924223031928810330585953871541593536283, 	0.9914791374956780166256527164832613053574,
				0.9905368681523049357966736891640434381216, 	0.9895954943108964281831839869512129866330,
				0.9886550151203967163746519649066284074237, 	0.9877154297305588385354051961226109899227,
				0.9867767372919438797327625416330343864518, 	0.9858389369559202039956868221933583419625,
				0.9849020278746626871032638290431658501235, 	0.9839660092011519501023140705695025630520,
				0.9830308800891735935534443109670000387768, 	0.9820966396933174325048466155419862577528,
				0.9811632871689767321931532752331431453491, 	0.9802308216723474444706566402213564033800,
				0.9792992423604274449582035491768120172661, 	0.9783685483910157709230746967427200384407,
				0.9774387389227118598811599372828827520575, 	0.9765098131149147889227411777252636721429,
				0.9755817701278225147611951665163479411869, 	0.9746546091224311145039291392620050672727,
				0.9737283292605340271448629345703623656609, 	0.9728029297047212957777718459314622781631,
				0.9718784096183788105298051271677986565965,		0.9709547681656875522144957200697952895280
			},
		    
			{
				1.0000000000000000000000000000000000000000,		0.9700320045116228367035774232914930379400,
				0.9409620897768370674212298508058219852849, 	0.9127633421156708668942503744059309052528,
				0.8854096543971923811501043960464255901147, 	0.8588757018688517364879932717859212289637,
				0.8331369187101692180902460141030849026557, 	0.8081694752890624155161689578277768341910,
				0.7839502560997556536888618983783791053116, 	0.7604568383618460545183896873859249753543,
				0.7376674712607126902372883387750345338472, 	0.7155610558100490615694685434237323547987,
				0.6941171253178751117406951384261687867164, 	0.6733158264379437043232142381368341940533,
				0.6531379007889984662634253213819854052726, 	0.6335646671248656289427239706049936967143,
				0.6145780040388724765036124496076447154217, 	0.5961603331865797040852326968966728810261,
				0.5782946030112948570545930362131434268247, 	0.5609642729572995100665682618108293115511,
				0.5441532981561743827978648643747061873131, 	0.5278461145720445955231454653404664082188,
				0.5120276245919921478529972155927751107378, 	0.4966831830482948512984566287866591847562,
				0.4817985836595507424420546966358580262381, 	0.4673600458781348185224193866260805625424,
				0.4533542021318111302275642196084653301628, 	0.4397680854476881857303133336231578259611,
				0.4265891174470596033395475021945475958821, 	0.4138050967000153253100465421861800587782,
				0.4014041874290417902572763743098032661210, 	0.3893749085511525646401543103372782315254
			},
		    
			{
				1.0000000000000000000000000000000000000000000,	0.3777061230484043540417651455683576466650000,
				0.1426619153882563708052119679085105421822000,	0.0538842789679578114076165050703859298545800,
				0.0203524221022460198907862721163275696205800,	0.0076872344468839996101743286763347159496400,
				0.0029035155198967005412614828182250511400990,	0.0010966755902310549151227158892825815595730,
				0.0004142210854279922997296008273437255752956,	0.0001564538402619088712753422615493598849163,
				5.909357344135995142394679824207999201121E-5,	2.232000452161222135025591154935960584027E-5,
				8.430402374281007236700902260035220289887E-6,	3.184214596527742337148476455363347356131E-6,
				1.202697350208632670782595114365065060885E-6,	4.542661533478916755570208360842380811059E-7,
				1.715791076131440947144583312662638239090E-7,	6.480647953266561572601959656715022445021E-8,
				2.447780413269889735078224512008720987199E-8,	9.245416499699910342143072277116651273927E-9,
				3.492050422069402212293514861017928736701E-9,	1.318968826409377991494549187659977485249E-9,
				4.981826018447900060525041555590742055479E-10,	1.881666191129624879723808164319051826703E-10,
				7.107168419228284402686789774896404982106E-11,	2.684421029478771850078976357840397379201E-11,
				1.013922259674033292202917547107956246173E-11,	3.829646457739566105989785588606755995719E-12,
				1.446480916198866420590826731657500079699E-12,	5.463446989209777070985952848270039796153E-13,
				2.063577380774902353530525926195322827410E-13,	7.794258121028692337871970872695782456164E-14
			}
			
	};
	
	public static final double[][] EXPONENTIAL_DISTRIBUTION_III_SIZE = {
			/* [3][32] */
			{
				1.0000000000000000000000000000000000000000,		0.9914791374956780166256527164832613053571,
				0.9830308800891735935534443109670000387763,		0.9746546091224311145039291392620050672719,
				0.9663497112088951922951613058690022829314,		0.9581155781885929401990530331782558043141,
				0.9499516070835989810875119461809064028436,		0.9418572000538799331122753584612083652659,
				0.9338317643535151384510743106138183393464,		0.9258747122872904292046909607697858626681,
				0.9179854611676617518466375609653990674902,		0.9101634332720854987115840832838713554612,
				0.9024080558007124218622779514513692802555,		0.8947187608344420312994997523024746481561,
				0.8870949852933344058775329566907233056474,		0.8795361708953763714606266672461444022383,
				0.8720417641155990268059148554652540437481,		0.8646112161455436233871237462566364157436,
				0.8572439828530728308830350554160731167048,		0.8499395247425244453469447315612369857573,
				0.8426973069152046221501168284377584096225,		0.8355167990302177406553164840946716839800,
				0.8283974752656300322277354108287439566785,		0.8213388142799641276318029906853001579399,
				0.8143402991740217040952958306017837324709,		0.8074014174530314363485930132316684297705,
				0.8005216609891194797686327175999898485396,		0.7937005259840997373758528196362056425534,
				0.7869375129325811858498730937766509221324,		0.7802321265853895589476145632070372895529,
				0.7735838759133007097276526159890746982448,		0.7669922740710829958085504579386416555178
			},
		    
			{
				1.0000000000000000000000000000000000000000000,	0.7604568383618460545183896873859249753475000,
				0.5782946030112948570545930362131434268144000,	0.4397680854476881857303133336231578259493000,
				0.3344246478719911187527828322027724928608000,	0.2543155103910080342970055083858543302085000,
				0.1933959689783251774319131539973439846964000,	0.1470692871211828233002294902623869285186000,
				0.1118398451043052539124374690378746581867000,	0.0850493750108985602659800234578596968909400,
				0.0646763788254389154655681775607238774758000,	0.0491835945582863241156170683610789877042500,
				0.0374020008170653143735533498156831735514100,	0.0284426072897526718347370026026486693779300,
				0.0216293752143329118535087528015400204365400,	0.0164482062912336825104561988130156459132400,
				0.0125081509529549918713848862125144537439400,	0.0095119089274368649464762531606995319241100,
				0.0072333961897444564781616481310238106761860,	0.0055006855970716932734388078251246759697760,
				0.0041830339779716833064716700383503988117580,	0.0031810167936485222816222493382931725715270,
				0.0024190259736738921137934575940109408536480,	0.0018395648438552342443599128094977711325760,
				0.0013989096651197544439950127319659303796870,	0.0010638104210907972987681203969116907947710,
				0.0008089819094390918283473978621390203944673,	0.0006151958251439810374839895543363501050953,
				0.0004678298721623988965815688638575721914033,	0.0003557644254758444808169155363704398225966,
				0.0002705434901989792929582192527080744710506,	0.0002057366471960948784546183663182928059645
			},
		    
			{
				1.000000000000000000000000000000000000000,		0.0001564538402619088712753422615493598848717,
				2.447780413269889735078224512008720985804E-8,	3.829646457739566105989785588606755992447E-12,
				5.991628951587712183461314435723455239107E-16,	9.374133589003324437283071562544462897124E-20,
				1.466619199127720628458909574032394007656E-23,	2.294582059053771218038974267927533833163E-27,
				3.589961749350406706790987553377863179812E-31,	5.616633020792314645332222710264644857908E-35,
				8.787438054448034835939954112296077697602E-39,	1.374828429682032112779050229478845154715E-42,
				2.150971875250036652628677686695580621313E-46,	3.365278101782278104362461212648493483965E-50,
				5.265106825731444425408506379787751403098E-54,	8.237461822748734749731771711361450782154E-58,
				1.288782536179903234906819256928735424052E-61,	2.016349770478283712998453222332343703812E-65,
				3.154656649025460159903286438614052035760E-69,	4.935581474477980619913950088312373997931E-73,
				7.721906756076146364991353446502442654680E-77,	1.208121966132492313782281967679468463452E-80,
				1.890153211061962317744312705074835436919E-84,	2.957217285540223765931001823632869648146E-88,
				4.626680008116659240109379372702265238809E-92,	7.238618549328510447646200176448777448608E-96,
				1.132509670233533294861752560334068442100E-99,	1.771854870417843101882482426208692422294E-103,
				2.772134988636384669818807165401424398102E-107,	4.337111646965654912069237407317707678694E-111,
				6.785577728124290751600099215097500773985E-115, 1.061629693960724289088455922591023103484E-118
			}
	
	};
	
	public static final double[][] EXPONENTIAL_DISTRIBUTION_III_SPEED = {
			/* [3][32] */
			{
				1.0000000000000000000000000000000000000000,		0.9951980443443537316500388424172839303752,
			    0.9904191474668262564830185894967173613892,		0.9856631986401875746675941557587114196642,
			    0.9809300876689149347041557365309129923940,		0.9762197048866395987965541168345276706016,
			    0.9715319411536058687432894158212596709598,		0.9668666878541423134736924881553750396380,
			    0.9622238368941451396373408016639000521875,		0.9576032806985736469363056351479270970296,
			    0.9530049122089577101698314104664824876542,		0.9484286248809172302397073765744987564880,
			    0.9438743126816934966419131566675496907225,		0.9393418700876924042461092785035073150884,
			    0.9348311920820394674392081270253399758265,		0.9303421741521465749826061515830447550861,
			    0.9258747122872904292046909607697858626672,		0.9214287029762026134209634491584644007645,
			    0.9170040432046712317435415947941667461407,		0.9126006304531540657099452867877830194818,
			    0.9082183626944031924279067014123113094560,		0.9038571383911010091985145255388756529519,
			    0.8995168564935076098442888811876009946339,		0.8951974164371194582318032579854959087286,
			    0.8908987181403393047402262055905414183192,		0.8866206620021572916876550405654798379036,
			    0.8823631488998431939863624175501337704454,		0.8781260801866497415560803096876886684788,
			    0.8739093576895269702812107160640808580937,		0.8697128837068475485533842136704059167642,
			    0.8655365610061430266950922187780245940470,		0.8613802928218509568132024098758678171240
			},
			    
			{
				1.000000000000000000000000000000000000000000,	0.857243982853072830883035055416073116703300,
			    0.734867246137799425692104349091725698937400,	0.629960524947436582383605303639195946052600,
			    0.540029869446153084936465415644391919699900,	0.462937356143645214602345480384983067321600,
			    0.396850262992049868687926409818180089809000,	0.340197500043594241063920093831306311583500,
			    0.291632259894029145223423158665267961335500,	0.250000000000000000000000000000097352251700,
			    0.214310995713268207720758763854101733807800,	0.183716811534449856423026087273002965715400,
			    0.157490131236859145595901325909860314588700,	0.135007467361538271234116353911150553048700,
			    0.115734339035911303650586370096290834824400,	0.099212565748012467171981602454583656718920,
			    0.085049375010898560265980023457859696888520,	0.072908064973507286305855789666345381391030,
			    0.062500000000000000000000000000048676125830,	0.053577748928317051930189690963546297109930,
			    0.045929202883612464105756521818268626674130,	0.039372532809214786398975331477480410666060,
			    0.033751866840384567808529088477800781543110,	0.028933584758977825912646592524083975704600,
			    0.024803141437003116792995400613655572746400,	0.021262343752724640066495005864473203970290,
			    0.018227016243376821576463947416593443112050,	0.015625000000000000000000000000018253547190,
			    0.013394437232079262982547422740891790191980,	0.011482300720903116026439130454571627979850,
			    0.009843133202303696599743832869373935671238,	0.008437966710096141952132272119453481206014
			},
			
			{
			    1.000000000000000000000000000000000000000,		0.007233396189744456478161648131023810675775,
			    5.232202043780962102557587008169005410143E-5,	3.784659032745836912993682954976324658164E-7,
			    2.737593822694567686662466634421542264066E-9,	1.980210072614684707158711353745069372717E-11,
			    1.432364399414465384287735340977513952565E-13,	1.036085918905020069841154248521752033776E-15,
			    7.494419938055456100418425186702743722723E-18,	5.421010862427522170037264004417260251684E-20,
			    3.921231931684654880817938739668273317360E-22,	2.836382411375207747860568187463889509638E-24,
			    2.051667772709962123314993704273413823620E-26,	1.484052584974173558955043468582713624191E-28,
			    1.073474031353259824558654154333806911547E-30,	7.764862968180290824468612020607860317513E-33,
			    5.616633020792314645332222710264644852793E-35,	4.062733189179202535382045195211707654781E-37,
			    2.938735877055718769921841343128853888538E-39,	2.125704089576016965228859756656407540404E-41,
			    1.537605986206336992222535387300608525931E-43,	1.112211328195318530448364746285024038827E-45,
			    8.045065183558638234146057828832053516826E-48,	5.819314384499884015403474144560288801662E-50,
			    4.209340649576656799996170991423257963815E-52,	3.044782861598424467581974062513986546956E-54,
			    2.202412074968526631812431321732133496007E-56,	1.593091911132452277028880397827266782094E-58,
			    1.152346495989819456843455045622426762614E-60,	8.335378753358135655955994470664225877261E-63,
			    6.029309691461763611680553229574282672923E-65,	4.361238574900884540660050746922306538111E-67,
			}
			
	};
	
	public static final double[][] EXPONENTIAL_DISTRIBUTION_P = {
			/* [3][32] */
			{
				1.0000000000000000000000000000000000000000,		0.9930924954370359015332102168880765048173,
			    0.9862327044933591729073804985266878802443,		0.9794202975869268710835182321094224250961,
			    0.9726549474122855185227020947295413763023,		0.9659363289248455510651443129204733029988,
			    0.9592641193252643901322834293949397264660,		0.9526379980439373889289005948680289570903,
			    0.9460576467255959075051119972754354254470,		0.9395227492140117766851490088262829075331,
			    0.9330329915368074159813432661499603336007,		0.9265880618903708756879317851202732375877,
			    0.9201876506248750783904312382017973974891,		0.9138314502294005401326428921359892449876,
			    0.9075191553171608564550809482180658363403,		0.9012504626108302434560060155923701020040,
			    0.8950250709279724289295293992056807493013,		0.8888426811665701935046683790031660959701,
			    0.8827029962906548665450116490541232503509,		0.8766057213160350863710299119436526437378,
			    0.8705505632961241391362700174797799990040,		0.8645372313078651954249311342751209858410,
			    0.8585654364377537683418658040230197384022,		0.8526348917679567215371033354114150564474,
			    0.8467453123625271602457822707284519309456,		0.8408964152537145430311254762332558266219,
			    0.8350879194283693564930171007187976000468,		0.8293195458144416997480650199452263126561,
			    0.8235910172675731299989737240342361894393,		0.8179020585577811249918276889374069238047,
			    0.8122523963562355226097093827753290960475,		0.8066417592221263022701629871861700330324
			},
			
			{
				1.000000000000000000000000000000000000000000,	0.801069877589622077182576980035615205902700,
			    0.641712948781452099037917089781420222618900,	0.514056913328033254673172479396413573907600,
			    0.411795508633786564999486862017198273163900,	0.329876977693223564843500492807512798916800,
			    0.264254510140345093624873553521627364440900,	0.211686328090631790061445567682195415303500,
			    0.169575540930958985396762834141244920349500,	0.135841857815757262606900740466230788178000,
			    0.108818820412015517392033752185036062422000,	0.087171479146900338767218235365499637556050,
			    0.069830446129513747913186914700207350540810,	0.055939066932998276808095587450398613186620,
			    0.044811101500494605684562734558780780465070,	0.035896823593657343962457092086843785683310,
			    0.028755864082027346199700976193834163154190,	0.023035456520173456442055699495851578765410,
			    0.018453010334836412492976026695119689178670,	0.014782150730087436054767374957445947431420,
			    0.011841535675862485018337967197721359270050,	0.009485897534336303604787967133085469399049,
			    0.007598866776658480613458610115084898737984,	0.006087223278597655149117219956228990612855,
			    0.004876291206646921576592633968279399063782,	0.003906250000000000000000000000006084516053,
			    0.003129179209334461238994441328268996020587,	0.002506691206177547261866863631962577257343,
			    0.002008034817687629901067079997645368310618,	0.001608576205600728769529245554757186330929,
			    0.001288581944114154550169923800031354012535,	0.001032244180235723021972162318445464753156
			},
			
			{
				1.000000000000000000000000000000000000000,		0.0008268997191040304299275217487598638498908,
			    6.837631454543244275598561791827450446268E-7,	5.654035529098691704742888887601969318770E-10,
			    4.675320390815916240837145591289455678271E-13,	3.866021117887026910581260785663924052584E-16,
			    3.196811776431032265107748321378670183434E-19,	2.643442759959277106397015416454182808165E-22,
			    2.185862075677909177530183421677021601630E-25,	1.807488736378216004902267757945329990433E-28,
			    1.494611928394845722509566662381681852231E-31,	1.235894183759231170477230799378805483584E-34,
			    1.021960553392813221805059629881904702629E-37,	8.450588945359167454685108853553438401193E-41,
			    6.987789625181120323479538530531788834637E-44,	5.778201278220326478541087516212630539830E-47,
			    4.777993013886937548374901071454718579294E-50,	3.950921081064128423947108109095179681258E-53,
			    3.267015532134120033414586853048549151733E-56,	2.701494225830208356330596231491229575841E-59,
			    2.233864816500159437321055999997722887780E-62,	1.847182189280358319436455385107649366142E-65,
			    1.527434433449896263866613728025637317872E-68,	1.263035103969543081968346060350962609985E-71,
			    1.044403372690945043917523022329044283453E-74,	8.636168555094444625386351863230863826745E-78,
			    7.141245352342656606906053992842560076147E-81,	5.905093775905105564186232605424573035226E-84,
			    4.882920384578890205960673105845289217904E-87,	4.037685494415628551550334502904113261957E-90,
			    3.338761001162701476381524668052565130775E-93,	2.760820534016929266476966660680800456743E-96
			}
	
	};
	
	public static final long[][] CUMULATIVE_DISTRIBUTION_TABLE_I = {
			/* [12][2] */
			{0x0200000000000000L, 0x0000000000000000L},	{0x0300000000000000L, 0x0000000000000000L},
			{0x0320000000000000L, 0x0000000000000000L}, {0x0321000000000000L, 0x0000000000000000L},
			{0x0321020000000000L, 0x0000000000000000L},	{0x0321020100000000L, 0x0000000000000000L},
			{0x0321020100200000L, 0x0000000000000000L},	{0x0321020100200100L, 0x0000000000000000L},
			{0x0321020100200100L, 0x0200000000000000L},	{0x0321020100200100L, 0x0200010000000000L},
			{0x0321020100200100L, 0x0200010000200000L},	{0x0321020100200100L, 0x0200010000200001L},	
			
	};
	
	public static final long[][] CUMULATIVE_DISTRIBUTION_TABLE_III = {
			/* [14][3] */
			{0x0000020000000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000030000000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032000000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032100000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032102000000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032102010000L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0000000000000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100000000000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100020000000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100020001000000L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100020001000020L,	0x0000000000000000L},
			{0x0000032102010020L,	0x0100020001000020L,	0x0001000000000000L},
			{0x0000032102010020L,	0x0100020001000020L,	0x0001000002000000L},
			{0x0000032102010020L,	0x0100020001000020L,	0x0001000002000001L}
			
	};
	
	private static long modulus7 (long number) {
		
		long temporary = number;
		
		for (int i = 0; i < 2; i++) {
			
			temporary = (temporary & 7) + (temporary >> 3);
			
		}
		
		return ((temporary - 7) >> 3) & temporary;
		
	}
	
	/******************************************************************************************************************
	 * Description:	Samples Polynomial Y, Such That Each Coefficient is in the Range [-B, B], for Heuristic qTESLA
	 * 				Security Category-1 and Security Category-3 (Option for Size or Speed)
	 * 
	 * @param		Y				Polynomial Y
	 * @param		seed			Kappa-Bit Seed
	 * @param		seedOffset		Starting Point of the Kappa-Bit Seed
	 * @param		nonce			Domain Separator for Error Polynomial and Secret Polynomial
	 * @param		n				Polynomial Degree
	 * @param		q				Modulus
	 * @param		b				Determines the Interval the Randomness is Chosen in During Signing
	 * @param		bBit			b = 2 ^ bBit - 1
	 * 
	 * @return		none		
	 ******************************************************************************************************************/
	public static void sampleY (int[] Y, final byte[] seed, int seedOffset, int nonce, int n, int q, int b, int bBit) {
		
		int i = 0;
		int position = 0;
		int numberOfByte = (bBit + 1 + 7) / 8;
		int numberOfBlock = n;
		byte[] buffer = new byte[n * numberOfByte];
		int[] y = new int[4];
		
		short dualModeSampler = (short) (nonce << 8);
		
		if (q == Parameter.Q_I) {
		
			FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
				buffer, 0, n * numberOfByte, dualModeSampler++, seed, seedOffset, Polynomial.RANDOM
			);
		
		}
		
		if (q == Parameter.Q_III_SIZE || q == Parameter.Q_III_SPEED) {
			
			FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
				buffer, 0, n * numberOfByte, dualModeSampler++, seed, seedOffset, Polynomial.RANDOM
			);
			
		}
		
		while (i < n) {
			
			if (position > numberOfBlock * numberOfByte * 4) {
				
				if (q == Parameter.Q_I) {
					
					numberOfBlock =
						FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE /
							((bBit + 1 + 7) / 8);
					
					FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
						buffer, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE,
						dualModeSampler++,
						seed, seedOffset, Polynomial.RANDOM
					);
					
				}
				
				if (q == Parameter.Q_III_SIZE || q == Parameter.Q_III_SPEED) {
					
					numberOfBlock =
						FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_256_RATE /
							((bBit + 1 + 7) / 8);
					
					FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
						buffer, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_256_RATE,
						dualModeSampler++,
						seed, seedOffset, Polynomial.RANDOM
					);
					
				}
				
				position = 0;
				
			}
			
			y[0]  = (CommonFunction.load32 (buffer, position)						& ((1 << (bBit + 1)) - 1)) - b;
			y[1]  = (CommonFunction.load32 (buffer, position + numberOfByte)		& ((1 << (bBit + 1)) - 1)) - b;
			y[2]  = (CommonFunction.load32 (buffer, position + numberOfByte * 2)	& ((1 << (bBit + 1)) - 1)) - b;
			y[3]  = (CommonFunction.load32 (buffer, position + numberOfByte * 3)	& ((1 << (bBit + 1)) - 1)) - b;
			
			if (i < n && y[0] != (1 << bBit)) {
				
				Y[i++] = y[0];
				
			}
			
			if (i < n && y[1] != (1 << bBit)) {
				
				Y[i++] = y[1];
				
			}
			
			if (i < n && y[2] != (1 << bBit)) {
				
				Y[i++] = y[2];
				
			}
			
			if (i < n && y[3] != (1 << bBit)) {
				
				Y[i++] = y[3];
				
			}
			
			position += numberOfByte * 4;
			
		}
		
	}
	
	/*******************************************************************************************************************
	 * Description:	Samples Polynomial Y, Such That Each Coefficient is in the Range [-B, B], for Provably-Secure qTESLA
	 *				Security Category-1 and Security Category-3
	 * 
	 * @param		Y				Polynomial Y
	 * @param		seed			Kappa-Bit Seed
	 * @param		seedOffset		Starting Point of the Kappa-Bit Seed
	 * @param		nonce			Domain Separator for Error Polynomial and Secret Polynomial
	 * @param		n				Polynomial Degree
	 * @param		q				Modulus
	 * @param		b				Determines the Interval the Randomness is Chosen in During Signing
	 * @param		bBit			b = 2 ^ bBit - 1
	 * 
	 * @return		none		
	 *******************************************************************************************************************/
	public static void sampleY (long[] Y, final byte[] seed, int seedOffset, int nonce, int n, int q, int b, int bBit) {
		
		int i = 0;
		int position = 0;
		int numberOfByte = (bBit + 1 + 7) / 8;
		int numberOfBlock = n;
		byte[] buffer = new byte[n * numberOfByte];
		
		short dualModeSampler = (short) (nonce << 8);
		
		if (q == Parameter.Q_I_P) {
			
			FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
				buffer, 0, n * numberOfByte, dualModeSampler++, seed, seedOffset, Polynomial.RANDOM
			);
		
		}
		
		if (q == Parameter.Q_III_P) {
			
			FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
				buffer, 0, n * numberOfByte, dualModeSampler++, seed, seedOffset, Polynomial.RANDOM
			);
			
		}
		
		while (i < n) {
			
			if (position > numberOfBlock * numberOfByte) {
				
				if (q == Parameter.Q_I_P) {
					
					numberOfBlock =
						FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE /
							((bBit + 1 + 7) / 8);
					
					FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
						buffer, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE,
						dualModeSampler++,
						seed, seedOffset, Polynomial.RANDOM
					);
					
				}
				
				if (q == Parameter.Q_III_P) {
					
					numberOfBlock =
						FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_256_RATE /
							((bBit + 1 + 7) / 8);
					
					FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
						buffer, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_256_RATE,
						dualModeSampler++,
						seed, seedOffset, Polynomial.RANDOM
					);
					
				}
				
				position = 0;
				
			}
			
			Y[i]  = (CommonFunction.load32 (buffer, position) & ((1 << (bBit + 1)) - 1)) - b;
			
			if (Y[i] != (1 << bBit)) {
				
				i++;
				
			}
			
			position += numberOfByte;
			
		}
		
	}
	
	/*****************************************************************************************************************
	 * Description:	Samples A Bit from Bernoulli with Restriction of 20-Bit Exponent
	 *****************************************************************************************************************/
	private static int bernoulli (long result, long fractionOfExponent, double[][] exponentialDistribution) {
		
		/* *
		 * Computes the Actual Bernoulli Parameter = exp (-t / f)
		 * Yields A Fraction of 2^62, to Keep Only 62 Bits of Precision in This Implementation
		 * */
		double bernoulliParameter = 4611686018427387904.0;
		
		for (long i = 0, j = fractionOfExponent; i < 3; i++, j >>= 5) {
			
			bernoulliParameter *= exponentialDistribution[(int) i][(int) (j & 31)];
			
		}
		
		/* Sample from Bernoulli of bernoulliParameter */
		return (int) (((result & 0x3FFFFFFFFFFFFFFFL) - Math.round (bernoulliParameter)) >>> 63);
		
	}
	
	/**********************************************************************************************************************
	 * Description:	Gaussian Sampler for Heuristic qTESLA Security Category-1
	 * 
	 * @param		data						Data to be Sampled
	 * @param		dataOffset					Starting Point of the Data to be Sampled
	 * @param		seed						Kappa-Bit Seed
	 * @param		seedOffset					Starting Point of the Kappa-Bit Seed
	 * @param		nonce						Domain Separator for Error Polynomial and Secret Polynomial
	 * 
	 * @return		none
	 **********************************************************************************************************************/
	public static void polynomialGaussSamplerI (int[] data, int dataOffset, final byte[] seed, int seedOffset, int nonce) {
		
		byte[] seedExpander = new byte[Parameter.N_I * Long.SIZE / Byte.SIZE];
		short domainSeparator = (short) (nonce << 8);
		int index;
		int j = 0;
		long k;
		long sign;
		long r;
		long s;
		long randomBit;
		long bitRemained;
		long y;
		long z;
		long buffer;
		
		FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
			seedExpander, 0, Parameter.N_I * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
		);
		
		for (index = 0; index < Parameter.N_I; index++) {
			
			if (j + 46 > Parameter.N_I) {

				FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
					seedExpander, 0, Parameter.N_I * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
				);
				
				j = 0;
				
			}
			
			do {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
				do {
					
					/* Sample x from D^+_{\SIGMA_2} and y from U ({0, ..., k - 1}) */
					do {
						
						r = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						s = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					
						if (bitRemained <= 64 - 6) {
						
							randomBit = (randomBit << 6) ^ ((r >>> 58) & 63L);
							bitRemained += 6;
						
						}
					
						r &= 0x03FFFFFFFFFFFFFFL;
					
					/*
					 * Checks If r Exceeds A Maximum Value
					 * Variation is Random ad Does not Depend on Private Data
					 */
					} while (r > 0x0321020100200100L);
				
					y = 0;
				
					for (int i = 0; i < 12; i++) {
					
						long c	= s - CUMULATIVE_DISTRIBUTION_TABLE_I[i][1];
						
						long b	= (((c & CUMULATIVE_DISTRIBUTION_TABLE_I[i][1]) & 1) + (CUMULATIVE_DISTRIBUTION_TABLE_I[i][1] >> 1) + (c >>> 1)) >>> 63;
						
						c		= r - (CUMULATIVE_DISTRIBUTION_TABLE_I[i][0] + b);
						
						y += ~ (c >>> 63) & 1L;
					
					}
				
					/* The Next Sampler Works Exclusively for xi <= 28 */
					do {
					
						do {
						
							if (bitRemained < 6) {
							
								randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
								bitRemained = 64;
							
							}
						
							z = randomBit & 63L;
							randomBit >>= 6;
							bitRemained -= 6;
						
						} while (z == 63);
					
						if (bitRemained < 2) {
						
							randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
							bitRemained = 64;
						
						}
					
						z = (modulus7 (z) << 2) + (randomBit & 3L);
						randomBit >>= 2;
						bitRemained -= 2;
						
					/*
					 * Making Sure Random z Does not Exceed A Certain Limit
					 * No Private Data is Leaked
					 * It Varies Uniformly
					 */
					} while (z >= Parameter.XI_I);
				
					/* Sample A Bit from Bernoulli_{exp (- y * (y + 2 * k * x) / (2 * k^2 * SIGMA_2^2))} */
					k = (long) (Parameter.XI_I * y + z);
					
					buffer = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				
				} while (bernoulli (buffer, z * ((k << 1) - z), EXPONENTIAL_DISTRIBUTION_I) == 0);
				
				/* Put Last Random Bits into Sign Bit */
				randomBit <<= (64 - bitRemained);
				
				if (bitRemained == 0) {
					
					randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					bitRemained = 64;
					
				}
				
				sign = randomBit >> 63;
				randomBit <<= 1;
				bitRemained--;
				
			} while ((k | (sign & 1L)) == 0);
			
			if (bitRemained == 0) {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
			}
			
			sign = randomBit >> 63;
			randomBit <<= 1;
			bitRemained--;
			k = ((k << 1) & sign) - k;
			data[dataOffset + index] = (int) ((k << 48) >> 48);
		
		}
		
	}
	
	/**********************************************************************************************************************
	 * Description:	Gaussian Sampler for Provably-Secure qTESLA Security Category-1
	 * 
	 * @param		data						Data to be Sampled
	 * @param		dataOffset					Starting Point of the Data to be Sampled
	 * @param		seed						Kappa-Bit Seed
	 * @param		seedOffset					Starting Point of the Kappa-Bit Seed
	 * @param		nonce						Domain Separator for Error Polynomial and Secret Polynomial
	 * 
	 * @return		none
	 **********************************************************************************************************************/
	public static void polynomialGaussSamplerIP (long[] data, int dataOffset, final byte[] seed, int seedOffset, int nonce) {
		
		byte[] seedExpander = new byte[Parameter.N_I_P * Long.SIZE / Byte.SIZE];
		short domainSeparator = (short) (nonce << 8);
		int index;
		int j = 0;
		long k;
		long sign;
		long r;
		long s;
		long randomBit;
		long bitRemained;
		long y;
		long z;
		long buffer;
		
		FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
			seedExpander, 0, Parameter.N_I_P * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
		);
		
		for (index = 0; index < Parameter.N_I_P; index++) {
			
			if (j + 46 > Parameter.N_I_P) {

				FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
					seedExpander, 0, Parameter.N_I_P * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
				);
				
				j = 0;
				
			}
			
			do {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
				do {
					
					/* Sample x from D^+_{\SIGMA_2} and y from U ({0, ..., k - 1}) */
					do {
						
						r = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						s = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					
						if (bitRemained <= 64 - 6) {
						
							randomBit = (randomBit << 6) ^ ((r >>> 58) & 63L);
							bitRemained += 6;
						
						}
					
						r &= 0x03FFFFFFFFFFFFFFL;
					
					/*
					 * Checks If r Exceeds A Maximum Value
					 * Variation is Random ad Does not Depend on Private Data
					 */
					} while (r > 0x0321020100200100L);
				
					y = 0;
				
					for (int i = 0; i < 12; i++) {
					
						long c	= s - CUMULATIVE_DISTRIBUTION_TABLE_I[i][1];
						
						long b	= (((c & CUMULATIVE_DISTRIBUTION_TABLE_I[i][1]) & 1) + (CUMULATIVE_DISTRIBUTION_TABLE_I[i][1] >> 1) + (c >>> 1)) >>> 63;
						
						c		= r - (CUMULATIVE_DISTRIBUTION_TABLE_I[i][0] + b);
						
						y += ~ (c >>> 63) & 1L;
					
					}
				
					/* The Next Sampler Works Exclusively for xi <= 28 */
					do {
					
						do {
						
							if (bitRemained < 6) {
							
								randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
								bitRemained = 64;
							
							}
						
							z = randomBit & 63L;
							randomBit >>= 6;
							bitRemained -= 6;
						
						} while (z == 63);
					
						if (bitRemained < 2) {
						
							randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
							bitRemained = 64;
						
						}
					
						z = (modulus7 (z) << 2) + (randomBit & 3L);
						randomBit >>= 2;
						bitRemained -= 2;
						
					/*
					 * Making Sure Random z Does not Exceed A Certain Limit
					 * No Private Data is Leaked
					 * It Varies Uniformly
					 */
					} while (z >= Parameter.XI_I_P);
				
					/* Sample A Bit from Bernoulli_{exp (- y * (y + 2 * k * x) / (2 * k^2 * SIGMA_2^2))} */
					k = (long) (Parameter.XI_I_P * y + z);
					
					buffer = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				
				} while (bernoulli (buffer, z * ((k << 1) - z), EXPONENTIAL_DISTRIBUTION_P) == 0);
				
				/* Put Last Random Bits into Sign Bit */
				randomBit <<= (64 - bitRemained);
				
				if (bitRemained == 0) {
					
					randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					bitRemained = 64;
					
				}
				
				sign = randomBit >> 63;
				randomBit <<= 1;
				bitRemained--;
				
			} while ((k | (sign & 1L)) == 0);
			
			if (bitRemained == 0) {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
			}
			
			sign = randomBit >> 63;
			randomBit <<= 1;
			bitRemained--;
			k = ((k << 1) & sign) - k;
			data[dataOffset + index] = (k << 48) >> 48;
		
		}
		
	}
	
	/*******************************************************************************************************************************************************************************
	 * Description:	Gaussian Sampler for Heuristic qTESLA Security Category-3 (Option for Size or Speed)
	 * 
	 * @param		data						Data to be Sampled
	 * @param		dataOffset					Starting Point of the Data to be Sampled
	 * @param		seed						Kappa-Bit Seed
	 * @param		seedOffset					Starting Point of the Kappa-Bit Seed
	 * @param		nonce						Domain Separator for Error Polynomial and Secret Polynomial
	 * @param		n							Polynomial Degree
	 * @param		xi				
	 * @param		exponentialDistribution		Exponential Distribution Table
	 * 
	 * @return		none
	 *******************************************************************************************************************************************************************************/
	public static void polynomialGaussSamplerIII (int[] data, int dataOffset, final byte[] seed, int seedOffset, int nonce, int n, double xi, double[][] exponentialDistribution) {
		
		byte[] seedExpander = new byte[n * Long.SIZE / Byte.SIZE];
		short domainSeparator = (short) (nonce << 8);
		int index;
		int j = 0;
		long k;
		long sign;
		long r;
		long s;
		long t;
		long randomBit;
		long bitRemained;
		long y;
		long z;
		
		FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
			seedExpander, 0, n * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
		);
		
		for (index = 0; index < n; index++) {
			
			if (j + 46 > n) {

				FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
					seedExpander, 0, n * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
				);
				
				j = 0;
				
			}
			
			do {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
				do {
					
					/* Sample x from D^+_{\SIGMA_2} and y from U ({0, ..., k - 1}) */
					do {
						
						r = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						s = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						t = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					
						if (bitRemained <= 64 - 6) {
						
							randomBit = (randomBit << 6) ^ ((r >>> 58) & 63L);
							bitRemained += 6;
						
						}
					
						r &= 0x000003FFFFFFFFFFL;
					
					/*
					 * Checks If r Exceeds A Maximum Value
					 * Variation is Random ad Does not Depend on Private Data
					 */
					} while (r > 0x0000032102010020L);
				
					y = 0;
				
					for (int i = 0; i < 14; i++) {
					
						long c 	= t - CUMULATIVE_DISTRIBUTION_TABLE_III[i][2];
						
						long b	= ((c & CUMULATIVE_DISTRIBUTION_TABLE_III[i][2] & 1L) + (CUMULATIVE_DISTRIBUTION_TABLE_III[i][2] >> 1) + (c >>> 1)) >> 63;
						
						/* Least significant Bits of All CUMULATIVE_DISTRIBUTION_TABLE[i][1] are Zero: Overflow Cannot Occur at This Point */
						c		= s - (CUMULATIVE_DISTRIBUTION_TABLE_III[i][1] + b);
						
						b		= (((c & b) & 1L) + (CUMULATIVE_DISTRIBUTION_TABLE_III[i][1] >> 1) + (c >>> 1)) >> 63;
						
						/* Least significant Bits of All CUMULATIVE_DISTRIBUTION_TABLE[i][0] are Zero: Overflow Cannot Occur at This Point */
						c		= r - (CUMULATIVE_DISTRIBUTION_TABLE_III[i][0] + b);
						
						y += ~ (c >>> 63) & 1L;
						
					}
				
					/* The Next Sampler Works Exclusively for xi <= 28 */
					do {
					
						do {
						
							if (bitRemained < 6) {
							
								randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
								bitRemained = 64;
							
							}
						
							z = randomBit & 63L;
							randomBit >>= 6;
							bitRemained -= 6;
						
						} while (z == 63L);
					
						if (bitRemained < 2) {
						
							randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
							bitRemained = 64;
						
						}
					
						z = (modulus7 (z) << 2) + (randomBit & 3L);
						randomBit >>= 2;
						bitRemained -= 2;
					
					/*
					 * Making Sure Random z Does not Exceed A Certain Limit
					 * No Private Data is Leaked
					 * It Varies Uniformly
					 */
					} while (z >= xi);
				
					/* Sample A Bit from Bernoulli_{exp (- y * (y + 2 * k * x) / (2 * k^2 * SIGMA_2^2))} */
					k = (long) (xi * y + z);
				
				} while (bernoulli (CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE), z * ((k << 1) - z), exponentialDistribution) == 0);
				
				/* Put Last Random Bits into Sign Bit */
				randomBit <<= (64 - bitRemained);
				
				if (bitRemained == 0L) {
					
					randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					bitRemained = 64;
					
				}
				
				sign = randomBit >> 63;
				randomBit <<= 1;
				bitRemained--;
				
			} while ((k | (sign & 1L)) == 0);
			
			if (bitRemained == 0) {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
			}
			
			sign = randomBit >> 63;
			randomBit <<= 1;
			bitRemained--;
			k = ((k << 1) & sign) - k;
			data[dataOffset + index] = (int) ((k << 48) >> 48);
		
		}
		
	}
	
	/**************************************************************************************************************************
	 * Description:	Gaussian Sampler for Provably-Secure qTESLA Security Category-3
	 * 
	 * @param		data						Data to be Sampled
	 * @param		dataOffset					Starting Point of the Data to be Sampled
	 * @param		seed						Kappa-Bit Seed
	 * @param		seedOffset					Starting Point of the Kappa-Bit Seed
	 * @param		nonce						Domain Separator for Error Polynomial and Secret Polynomial
	 * 
	 * @return		none
	 **************************************************************************************************************************/
	public static void polynomialGaussSamplerIIIP (long[] data, int dataOffset, final byte[] seed, int seedOffset, int nonce) {
		
		byte[] seedExpander = new byte[Parameter.N_III_P * Long.SIZE / Byte.SIZE];
		short domainSeparator = (short) (nonce << 8);
		int index;
		int j = 0;
		long k;
		long sign;
		long r;
		long s;
		long t;
		long randomBit;
		long bitRemained;
		long y;
		long z;
		
		FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
			seedExpander, 0, Parameter.N_III_P * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
		);
		
		for (index = 0; index < Parameter.N_III_P; index++) {
			
			if (j + 46 > Parameter.N_III_P) {

				FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK256Simple (
					seedExpander, 0, Parameter.N_III_P * Long.SIZE / Byte.SIZE, domainSeparator++, seed, seedOffset, Polynomial.RANDOM
				);
				
				j = 0;
				
			}
			
			do {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
				do {
					
					/* Sample x from D^+_{\SIGMA_2} and y from U ({0, ..., k - 1}) */
					do {
						
						r = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						s = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
						t = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					
						if (bitRemained <= 64 - 6) {
						
							randomBit = (randomBit << 6) ^ ((r >>> 58) & 63L);
							bitRemained += 6;
						
						}
					
						r &= 0x000003FFFFFFFFFFL;
					
					/*
					 * Checks If r Exceeds A Maximum Value
					 * Variation is Random ad Does not Depend on Private Data
					 */
					} while (r > 0x0000032102010020L);
				
					y = 0;
				
					for (int i = 0; i < 14; i++) {
					
						long c 	= t - CUMULATIVE_DISTRIBUTION_TABLE_III[i][2];
						
						long b	= ((c & CUMULATIVE_DISTRIBUTION_TABLE_III[i][2] & 1L) + (CUMULATIVE_DISTRIBUTION_TABLE_III[i][2] >> 1) + (c >>> 1)) >> 63;
						
						/* Least significant Bits of All CUMULATIVE_DISTRIBUTION_TABLE[i][1] are Zero: Overflow Cannot Occur at This Point */
						c		= s - (CUMULATIVE_DISTRIBUTION_TABLE_III[i][1] + b);
						
						b		= (((c & b) & 1L) + (CUMULATIVE_DISTRIBUTION_TABLE_III[i][1] >> 1) + (c >>> 1)) >> 63;
						
						/* Least significant Bits of All CUMULATIVE_DISTRIBUTION_TABLE[i][0] are Zero: Overflow Cannot Occur at This Point */
						c		= r - (CUMULATIVE_DISTRIBUTION_TABLE_III[i][0] + b);
						
						y += ~ (c >>> 63) & 1L;
						
					}
				
					/* The Next Sampler Works Exclusively for xi <= 28 */
					do {
					
						do {
						
							if (bitRemained < 6) {
							
								randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
								bitRemained = 64;
							
							}
						
							z = randomBit & 63L;
							randomBit >>= 6;
							bitRemained -= 6;
						
						} while (z == 63L);
					
						if (bitRemained < 2) {
						
							randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
							bitRemained = 64;
						
						}
					
						z = (modulus7 (z) << 2) + (randomBit & 3L);
						randomBit >>= 2;
						bitRemained -= 2;
					
					/*
					 * Making Sure Random z Does not Exceed A Certain Limit
					 * No Private Data is Leaked
					 * It Varies Uniformly
					 */
					} while (z >= Parameter.XI_III_P);
				
					/* Sample A Bit from Bernoulli_{exp (- y * (y + 2 * k * x) / (2 * k^2 * SIGMA_2^2))} */
					k = (long) (Parameter.XI_III_P * y + z);
				
				} while (bernoulli (CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE), z * ((k << 1) - z), EXPONENTIAL_DISTRIBUTION_P) == 0);
				
				/* Put Last Random Bits into Sign Bit */
				randomBit <<= (64 - bitRemained);
				
				if (bitRemained == 0L) {
					
					randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
					bitRemained = 64;
					
				}
				
				sign = randomBit >> 63;
				randomBit <<= 1;
				bitRemained--;
				
			} while ((k | (sign & 1L)) == 0);
			
			if (bitRemained == 0) {
				
				randomBit = CommonFunction.load64 (seedExpander, (j++) * Long.SIZE / Byte.SIZE);
				bitRemained = 64;
				
			}
			
			sign = randomBit >> 63;
			randomBit <<= 1;
			bitRemained--;
			k = ((k << 1) & sign) - k;
			data[dataOffset + index] = (k << 48) >> 48;
		
		}
		
	}
	
	/*************************************************************************************************************************
	 * Description:	Encoding of C' by Mapping the Output of the Hash Function H to An N-Element Vector with Entries {-1, 0, 1}
	 * 
	 * @param		postionList			{0, ..., n - 1} ^ h
	 * @param		signList			{-1, +1} ^ h
	 * @param		output				Result of the Hash Function H
	 * @param		outputOffset		Starting Point of the Result of the Hash Function H
	 * @param		n					Polynomial Degree
	 * @param		h					Number of Non-Zero Entries of Output Elements of Encryption
	 * 
	 * @return		none
	 *************************************************************************************************************************/
	public static void encodeC (int[] positionList, short[] signList, byte[] output, int outputOffset, int n, int h) {
		
		int count = 0;
		int position;
		short domainSeparator = 0;
		short[] C = new short[n];
		byte[] randomness = new byte[FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE];
		
		/* Use the Hash Value as Key to Generate Some Randomness */
		FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
			randomness, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE,
			domainSeparator++,
			output, outputOffset, Polynomial.RANDOM
		);
		
		/* Use Rejection Sampling to Determine Positions to be Set in the New Vector */
		Arrays.fill (C, 0, n, (short) 0);
		
		/* Sample A Unique Position k times.
		 * Use Two Bytes
		 */
		for (int i = 0; i < h;) {
			
			if (count > FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE - 3) {
				
				FederalInformationProcessingStandard202.customizableSecureHashAlgorithmKECCAK128Simple (
					randomness, 0, FederalInformationProcessingStandard202.SECURE_HASH_ALGORITHM_KECCAK_128_RATE,
					domainSeparator++,
					output, outputOffset, Polynomial.RANDOM
				);
				
				count = 0;
				
			}
			
			position = (randomness[count] << 8) | (randomness[count + 1] & 0xFF);
			position &= (n - 1);
				
			/* Position is between [0, n - 1] and Has not Been Set Yet
			 * Determine Signature
			 */
			if (C[position] == 0) {
				
				if ((randomness[count + 2] & 1) == 1) {
						
					C[position] = -1;
						
				} else {
						
					C[position] = 1;
						
				}
					
				positionList[i] = position;
				signList[i] = C[position];
				i++;
					
			}
			
			count += 3;
			
		}
		
	}
	
}