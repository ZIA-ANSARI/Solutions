public class findNonzerodigit {

    public static void main(String args[]) {
        findNonzerodigit fNonzerodigit = new findNonzerodigit();
        long start = System.currentTimeMillis();
        // some time passes
        int[] arr = new int[]{46425, 23786, 87766, 85924, 7204, 36781, 4415, 53031, 57258, 65120, 65071, 77669, 24848, 81489, 92629, 16648, 63746, 17881, 71523, 85528, 60793, 41665, 48780, 26698, 274, 72596, 27073, 91324, 43512, 68816, 18145, 66316, 96959, 68735, 42752, 80735, 9305, 28862, 71927, 9667, 69957, 63331, 10921, 82378, 96385, 68655, 81222, 93697, 80835, 5427, 24768, 93262, 85517, 39641, 6959, 70187, 73801, 78158, 37516, 9284, 95249, 88447, 58507, 97550, 31642, 61451, 85051, 57213, 3594, 98290, 19213, 42847, 8913, 64415, 39072, 72171, 28425, 40596, 63664, 98178, 7295, 1325, 84283, 66552, 1313, 54636, 80658, 27072, 91040, 87812, 46610, 94650, 75177, 4990, 17295, 41625, 48189, 15092, 82458, 76513, 25021, 72616, 4528, 95906, 13610, 55077, 84370, 78777, 46772, 61740, 1913, 37715, 20311, 19608, 61380, 27511, 20764, 88694, 14320, 63550, 88242, 76578, 68872, 43011, 33938, 30815, 97755, 62657, 30227, 98930, 50518, 63528, 44992, 62685, 6750, 63591, 47172, 45578, 2755, 85739, 25861, 86489, 23981, 52902, 33187, 73964, 25538, 14097, 29905, 64818, 51453, 30386, 93513, 40066, 77969, 30357, 80337, 14758, 41674, 10151, 78807, 50568, 55931, 90306, 25460, 45526, 46949, 26118, 69458, 71084, 73566, 33005, 305, 1895, 914, 23035, 73840, 94063, 24379, 83710, 72456, 97844, 3971, 31916, 58071, 62116, 86864, 88107, 91093, 33828, 17789, 86659, 91668, 24970, 49661, 43338, 20997, 80520, 73110, 44108, 73280, 77138, 80323, 24196, 86674, 19015, 47704, 30681, 7076, 59706, 18783, 27475, 828, 12634, 83201, 86735, 12014, 24254, 49468, 60747, 85484, 68492, 89043, 80734, 94603, 33878, 41379, 53207, 77736, 89141, 27419, 38029, 91732, 34045, 3174, 94624, 56380, 37926, 90513, 5477, 90913, 62048, 88343, 60270, 78864, 68093, 13441, 92370, 76762, 55482, 68764, 31628, 40228, 80129, 95905, 26231, 15922, 73031, 8932, 40674, 4308, 26577, 80556, 6383, 62634, 13584, 45177, 80192, 94399, 57740, 88168, 77901, 69709, 37793, 98632, 1202, 73141, 33259, 78386, 64659, 52086, 63050, 25762, 54862, 31436, 73912, 47520, 72630, 30525, 76380, 91925, 79623, 63288, 97560, 83618, 81924, 63752, 70988, 30012, 53196, 58450, 21054, 65381, 64962, 44368, 70911, 52738, 61284, 25432, 35467, 60459, 87818, 64684, 9679, 9926, 34859, 41291, 59306, 97159, 18182, 12394, 88984, 49387, 26326, 84845, 70333, 13545, 83495, 98737, 64950, 16975, 12745, 96407, 48494, 51007, 43571, 63887, 39939, 90024, 21222, 15894, 54403, 5322, 57484, 195, 23517, 34582, 53188, 65593, 86759, 15918, 16297, 59228, 70483, 74279, 30535, 21440, 25233, 48696, 3762, 9008, 36140, 96281, 3115, 88748, 71874, 29592, 90480, 92939, 28054, 52915, 88182, 544, 86241, 30878, 18324, 73478, 52409, 49517, 58997, 35803, 88534, 5768, 97674, 95541, 75781, 77981, 73212, 70901, 12962, 4367, 49215, 84841, 53041, 28680, 93534, 66023, 83609, 6141, 8690, 89617, 33205, 98696, 38388, 56094, 63568, 13933, 56971, 32982, 74256, 92868, 6041, 65806, 84843, 23690, 51340, 21601, 9037, 36732, 83780, 69084, 77024, 9082, 82600, 13468, 14244, 74096, 84216, 67082, 59653, 76843, 732, 52190, 90000, 1686, 63114, 63713, 88187, 66386, 37471, 23153, 63549, 65037, 8423, 691, 44398, 35315, 30627, 76877, 50207, 23434, 28057, 22027, 1009, 96708, 16669, 3940, 66904, 21250, 54039, 87835, 50400, 29624, 63138, 2509, 29140, 57543, 3182, 6597, 82620, 58278, 53694, 2425, 17010, 45902, 67482, 88910, 69715, 53273, 10703, 84411, 93813, 77130, 12138, 37497, 5376, 45385, 22442, 20561, 14573, 30105, 60381, 35418, 1753, 25515, 3630, 35264, 92238, 9989, 21510, 89988, 71319, 58769, 20780, 5903, 93635, 58231, 56983, 4536, 65104, 16058, 94723, 54989, 26975, 941, 33255, 37090, 51880, 87963, 68883, 63340, 20557, 49985, 99874, 7948, 70177, 4949, 74361, 63473, 39875, 27160, 64376, 77723, 42096, 53201, 32364, 53996, 29208, 49853, 86202, 48813, 90209, 42656, 86527, 42730, 25783, 94364, 45089, 70436, 10227, 4486, 42809, 79240, 86614, 91872, 31973, 53234, 34947, 43177, 352, 69663, 65151, 90158, 19658, 6528, 83312, 84842, 28218, 17951, 48628, 22030, 68214, 3859, 9872, 91610, 21026, 16861, 74892, 21349, 52890, 65287, 38859, 82891, 65393, 14293, 23159, 49743, 7631, 23963, 98395, 41410, 93679, 84572, 2101, 69611, 25560, 45669, 77511, 45722, 75133, 61937, 39892, 9807, 10758, 19719, 69847, 46622, 43302, 8637, 4193, 26947, 26042, 65931, 70026, 30241, 71584, 31208, 88575, 27049, 53158, 40218, 1625, 27907, 2877, 77415, 87509, 13687, 88120, 39861, 33825, 29725, 49335, 45917, 87425, 16683, 63481, 93357, 16168, 72950, 43933, 51327, 80034, 7212, 8650, 38763, 78280, 17785, 44931, 22401, 83932, 28503, 80979, 63473, 92976, 20633, 46082, 41303, 91437, 41471, 73172, 48037, 12287, 99768, 65880, 89326, 60592, 26747, 47898, 92135, 28825, 47746, 47350, 77810, 21023, 92695, 13487, 24949, 15819, 90997, 47948, 16298, 53814, 6468, 41905, 54990, 42720, 79547, 91984, 14316, 42484, 90837, 95519, 12689, 78265, 16082, 75486, 24644, 61253, 42728, 16999, 80531, 54904, 45400, 50444, 2250, 10649, 3733, 90951, 75158, 22933, 74384, 4045, 68086, 65789, 8915, 35077, 61494, 14531, 64792, 79980, 79595, 45351, 25685, 26636, 11111, 65192, 42917, 51184, 45177, 35791, 29055, 46749, 96628, 35889, 26935, 94784, 35882, 11937, 75264, 59908, 59405, 40953, 53852, 53705, 90927, 15919, 58258, 54296, 76564, 91958, 14326, 74761, 59466, 4047, 58328, 30151, 88791, 61779, 94316, 20305, 19240, 70827, 17020, 43688, 92859, 13520, 90401, 11088, 83920, 38634, 73494, 2650, 53434, 24675, 23315, 52728, 98407, 4640, 47404, 48100, 64297, 59847, 52551, 19798, 83702, 47274, 99101, 96396, 56691, 20064, 94301, 97434, 44174, 70078, 36422, 24395, 83419, 40989, 19583, 17915, 13538, 5328, 65614, 55330, 62678, 97493, 58853, 8874, 22197, 51828, 5576, 25774, 83295, 50583, 11348, 80886, 20819, 90627, 61771, 56864, 38340, 4501, 22449, 45873, 53769, 83930, 70125, 28747, 38495, 27607, 40936, 13627, 88170, 94379, 24936, 57628, 65068, 41887, 24333, 72419, 11285, 32118, 58550, 5111, 36523, 15691, 13210, 37217, 41179, 38323, 45037, 73688, 24602, 44265, 30373, 87357, 7939, 3586, 89030, 42363, 63461, 76274, 95214, 63261, 48693, 17345, 12658, 31337, 77218, 80146, 85341, 37104, 39404, 82403, 99269, 69926, 88756, 9013, 52023, 74735, 30823, 15472, 90553, 13300, 22915, 81415, 85745, 17319, 95383, 29302, 54864, 30665, 63704, 52862, 44123, 45673, 95134, 40788, 76501, 67666, 4829, 42779, 98711, 18263, 7932, 9139, 64551, 31660, 99331, 64171, 84235, 39361, 98210, 21732, 43755, 43475, 9026, 57952, 64391, 69897, 64847, 55412, 20187, 6480, 91052, 61467, 78648, 17846, 95382, 54830, 64439, 70885, 69387, 81406, 60466, 52534, 21217, 56125, 97519, 41374, 80265, 20934, 12223, 83860, 7690, 42112, 35516, 10404, 14530, 84038, 1399, 68768, 48427, 44064, 876, 63585, 5283, 47825, 23817, 11110, 87442, 55309, 95542, 84256, 45428, 96170, 60805, 98218, 77944, 35523, 21439, 44340, 26528, 83730, 75126, 54818, 26432, 70226, 8866, 33801, 31451, 59645, 81327, 93543, 25135, 62057, 85686, 38166, 5148, 94930, 43794, 88852, 26684, 34675, 19477, 58427, 38338, 53843, 36634, 78660, 72448, 86961, 2620, 75810, 8260, 88781, 63622, 53788, 80039, 56633, 66269, 6233, 51216, 17077, 31250, 72305, 14607, 40886, 4157, 18036, 59028, 77947, 13894, 65789, 21265, 28034, 3507, 73750, 47297, 57630, 34874, 89034, 36619, 737, 82687, 78312, 41952, 25887, 50851, 41519, 25218, 8344, 40468, 86849, 6154, 63316, 37703, 31729, 70275, 7546, 7723, 85031, 76312, 22552, 76158, 82785, 92334, 72599, 39040, 21420, 3302, 7621, 42967, 54557, 33721, 52218, 80954, 18064, 12922, 76173, 26989, 5916, 84806, 89622, 45132, 17655, 92254, 17240, 15962, 73800, 95976, 7703, 85069, 97619, 82796, 600, 42957, 99362, 17700, 92241};
        System.out.println(fNonzerodigit.rightmostNonZeroDigit(arr.length, arr));
        long end = System.currentTimeMillis();
        long elapsedTime = end - start; 
        System.out.println(elapsedTime);
        
    }
    int rightmostNonZeroDigit(int N, int [] arr) {
		//Write your code here
		double power =1;
		double mod = 0;
		double mul = 0 ;
		double temp = 0;
		mul = arr[0];
		
		for(int i = 1;i < arr.length; i++){
		    power=1;
		    while(arr[i]%Math.pow(10, power) == 0){
		        power+=1;
		    }
            mod = Math.pow(10, power);
		    temp = arr[i]%mod;
            mod = mod/10;
		    temp = temp/mod;
		    power =1;
		    mul = temp*mul;
		    
		    while(mul%Math.pow(10, power) == 0){
		        power +=1;
		    }
            mod = Math.pow(10, power);
		    mul = mul%mod;
            mod = mod/10;
		    mul = mul/mod;
		}
		return (int) mul;
	}
    
}