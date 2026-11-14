package defpackage;

import android.R;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.SigningInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.opera.android.analytics.OSPPingReceiver;
import com.opera.android.analytics.OspSingleUploadService;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class xf8 implements vp7 {
    public static final gd7 m;
    public static final gd7 n;
    public static final gd7 o;
    public static final gd7 p;
    public static final gd7 q;
    public static j71 t = null;
    public static a31 u = null;
    public static uh4 v = null;
    public static final long w = 284400000;
    public final /* synthetic */ byte f = 17;
    public static final ue5 g = new ue5(243328504, new ef5((byte) 16), false);
    public static final short[] h = {4091, 7888, 11060, 11208, 6960, 4342, 6275, 9759, 1591, 6399, 9477, 5266, 586, 5825, 7538, 9710, 1134, 6407, 1711, 965, 7099, 7674, 3743, 6442, 10414, 8100, 1885, 1688, 1364, 10329, 10164, 9180, 12210, 6240, 997, 117, 4783, 4407, 1549, 7072, 2829, 6458, 4431, 8877, 7144, 2564, 5664, 4042, 12189, 432, 10751, 1237, 7610, 1534, 3983, 7863, 2181, 6308, 8720, 6570, 4843, 1690, 14, 3872, 5569, 9368, 12163, 2019, 7543, 2315, 4673, 7340, 1553, 1156, 8401, 11389, 1020, 2967, 10772, 7045, 3316, 11236, 5285, 11578, 10637, 10086, 9493, 6180, 9277, 6130, 3323, 883, 10469, 489, 1502, 2851, 11061, 9729, 2742, 12241, 4970, 10481, 10078, 1195, 730, 1762, 3854, 2030, 5892, 10922, 9020, 5274, 9179, 3604, 3782, 10206, 3180, 3467, 4668, 2446, 7613, 9386, 834, 7703, 6836, 3403, 5351, 12276, 3580, 1739, 10820, 9787, 10209, 4070, 12250, 8525, 10401, 2749, 7338, 10574, 6040, 943, 9330, 1477, 6865, 9668, 3585, 6633, 12145, 4063, 3684, 7680, 8188, 6902, 3533, 9807, 6090, 727, 10099, 7003, 6945, 1949, 9731, 10559, 6057, 378, 7871, 8763, 8901, 9229, 8846, 4551, 9589, 11664, 7630, 8821, 5680, 4956, 6251, 8388, 10156, 8723, 2341, 3159, 1467, 5460, 8553, 7783, 2649, 2320, 9036, 6188, 737, 3698, 4699, 5753, 9046, 3687, 16, 914, 5186, 10531, 4552, 1964, 3509, 8436, 7516, 5381, 10733, 3281, 7037, 1060, 2895, 7156, 8887, 5357, 6409, 8197, 2962, 6375, 5064, 6634, 5625, 278, 932, 10229, 8927, 7642, 351, 9298, 237, 5858, 7692, 3146, 12126, 7586, 2053, 11285, 3802, 5204, 4602, 1748, 11300, 340, 3711, 4614, 300, 10993, 5070, 10049, 11616, 12247, 7421, 10707, 5746, 5654, 3835, 5553, 1224, 8476, 9237, 3845, 250, 11209, 4225, 6326, 9680, 12254, 4136, 2778, 692, 8808, 6410, 6718, 10105, 10418, 3759, 7356, 11361, 8433, 6437, 3652, 6342, 8978, 5391, 2272, 6476, 7416, 8418, 10824, 11986, 5733, 876, 7030, 2167, 2436, 3442, 9217, 8206, 4858, 5964, 2746, 7178, 1434, 7389, 8879, 10661, 11457, 4220, 1432, 10832, 4328, 8557, 1867, 9454, 2416, 3816, 9076, 686, 5393, 2523, 4339, 6115, 619, 937, 2834, 7775, 3279, 2363, 7488, 6112, 5056, 824, 10204, 11690, 1113, 2727, 9848, 896, 2028, 5075, 2654, 10464, 7884, 12169, 5434, 3070, 6400, 9132, 11672, 12153, 4520, 1273, 9739, 11468, 9937, 10039, 9720, 2262, 9399, 11192, 315, 4511, 1158, 6061, 6751, 11865, 357, 7367, 4550, 983, 8534, 8352, 10126, 7530, 9253, 4367, 5221, 3999, 8777, 3161, 6990, 4130, 11652, 3374, 11477, 1753, 292, 8681, 2806, 10378, 12188, 5800, 11811, 3181, 1988, 1024, 9340, 2477, 10928, 4582, 6750, 3619, 5503, 5233, 2463, 8470, 7650, 7964, 6395, 1071, 1272, 3474, 11045, 3291, 11344, 8502, 9478, 9837, 1253, 1857, 6233, 4720, 11561, 6034, 9817, 3339, 1797, 2879, 6242, 5200, 2114, 7962, 9353, 11363, 5475, 6084, 9601, 4108, 7323, 10438, 9471, 1271, 408, 6911, 3079, 360, 8276, 11535, 9156, 9049, 11539, 850, 8617, 784, 7919, 8334, 12170, 1846, 10213, 12184, 7827, 11903, 5600, 9779, 1012, 721, 2784, 6676, 6552, 5348, 4424, 6816, 8405, 9959, 5150, 2356, 5552, 5267, 1333, 8801, 9661, 7308, 5788, 4910, 909, 11613, 4395, 8238, 6686, 4302, 3044, 2285, 12249, 1963, 9216, 4296, 11918, 695, 4371, 9793, 4884, 2411, 10230, 2650, 841, 3890, 10231, 7248, 8505, 11196, 6688, 4059, 6060, 3686, 4722, 11853, 5816, 7058, 6868, 11137, 7926, 4894, 12284, 4102, 3908, 3610, 6525, 7938, 7982, 11977, 6755, 537, 4562, 1623, 8227, 11453, 7544, 906, 11816, 9548, 10858, 9703, 2815, 11736, 6813, 6979, 819, 8903, 6271, 10843, 348, 7514, 8339, 6439, 694, 852, 5659, 2781, 3716, 11589, 3024, 1523, 8659, 4114, 10738, 3303, 5885, 2978, 7289, 11884, 9123, 9323, 11830, 98, 2526, 2116, 4131, 11407, 1844, 3645, 3916, 8133, 2224, 10871, 8092, 9651, 5989, 7140, 8480, 1670, 159, 10923, 4918, 128, 7312, 725, 9157, 5006, 6393, 3494, 6043, 10972, 6181, 11838, 3423, 10514, 7668, 3693, 6658, 6905, 11953, 10212, 11922, 9101, 8365, 5110, 45, 2400, 1921, 4377, 2720, 1695, 51, 2808, 650, 1896, 9997, 9971, 11980, 8098, 4833, 4135, 4257, 5838, 4765, 10985, 11532, 590, 12198, 482, 12173, 2006, 7064, 10018, 3912, 12016, 10519, 11362, 6954, 2210, 284, 5413, 6601, 3865, 10339, 11188, 6231, 517, 9564, 11281, 3863, 1210, 4604, 8160, 11447, 153, 7204, 5763, 5089, 9248, 12154, 11748, 1354, 6672, 179, 5532, 2646, 5941, 12185, 862, 3158, 477, 7279, 5678, 7914, 4254, 302, 2893, 10114, 6890, 9560, 9647, 11905, 4098, 9824, 10269, 1353, 10715, 5325, 6254, 3951, 1807, 6449, 5159, 1308, 8315, 3404, 1877, 1231, 112, 6398, 11724, 12272, 7286, 1459, 12274, 9896, 3456, 800, 1397, 10678, 103, 7420, 7976, 936, 764, 632, 7996, 8223, 8445, 7758, 10870, 9571, 2508, 1946, 6524, 10158, 1044, 4338, 2457, 3641, 1659, 4139, 4688, 9733, 11148, 3946, 2082, 5261, 2036, 11850, 7636, 12236, 5366, 2380, 1399, 7720, 2100, 3217, 10912, 8898, 7578, 11995, 2791, 1215, 3355, 2711, 2267, 2004, 8568, 10176, 3214, 2337, 1750, 4729, 4997, 7415, 6315, 12044, 4374, 7157, 4844, 211, 8003, 10159, 9290, 11481, 1735, 2336, 5793, 9875, 8192, 986, 7527, 1401, 870, 3615, 8465, 2756, 9770, 2034, 10168, 3264, 6132, 54, 2880, 4763, 11805, 3074, 8286, 9428, 4881, 6933, 1090, 10038, 2567, 708, 893, 6465, 4962, 10024, 2090, 5718, 10743, 780, 4733, 4623, 2134, 2087, 4802, 884, 5372, 5795, 5938, 4333, 6559, 7549, 5269, 10664, 4252, 3260, 5917, 10814, 5768, 9983, 8096, 7791, 6800, 7491, 6272, 1907, 10947, 6289, 11803, 6032, 11449, 1171, 9201, 7933, 2479, 7970, 11337, 7062, 8911, 6728, 6542, 8114, 8828, 6595, 3545, 4348, 4610, 2205, 6999, 8106, 5560, 10390, 9321, 2499, 2413, 7272, 6881, 10582, 9308, 9437, 3554, 3326, 5991, 11969, 3415, 12283, 9838, 12063, 4332, 7830, 11329, 6605, 12271, 2044, 11611, 7353, 11201, 11582, 3733, 8943, 9978, 1627, 7168, 3935, 5050, 2762, 7496, 10383, 755, 1654, 12053, 4952, 10134, 4394, 6592, 7898, 7497, 8904, 12029, 3581, 10748, 5674, 10358, 4901, 7414, 8771, 710, 6764, 8462, 7193, 5371, 7274, 11084, 290, 7864, 6827, 11822, 2509, 6578, 4026, 5807, 1458, 5721, 5762, 4178, 2105, 11621, 4852, 8897, 2856, 11510, 9264, 2520, 8776, 7011, 2647, 1898, 7039, 5950, 11163, 5488, 6277, 9182, 11456, 633, 10046, 11554, 5633, 9587, 2333, 7008, 7084, 5047, 7199, 9865, 8997, 569, 6390, 10845, 9679, 8268, 11472, 4203, 1997, 2, 9331, 162, 6182, 2000, 3649, 9792, 6363, 7557, 6187, 
    8510, 9935, 5536, 9019, 3706, 12009, 1452, 3067, 5494, 9692, 4865, 6019, 7106, 9610, 4588, 10165, 6261, 5887, 2652, 10172, 1580, 10379, 4638, 9949};
    public static final short[] i = {4091, 4401, 1081, 1229, 2530, 6014, 7947, 5329, 2579, 4751, 6464, 11703, 7023, 2812, 5890, 10698, 3109, 2125, 1960, 10925, 10601, 10404, 4189, 1875, 5847, 8546, 4615, 5190, 11324, 10578, 5882, 11155, 8417, 12275, 10599, 7446, 5719, 3569, 5981, 10108, 4426, 8306, 10755, 4679, 11052, 1538, 11857, 100, 8247, 6625, 9725, 5145, 3412, 7858, 5831, 9460, 5217, 10740, 7882, 7506, 12172, 11292, 6049, 79, 13, 6938, 8886, 5453, 4586, 11455, 2903, 4676, 9843, 7621, 8822, 9109, 2083, 8507, 8685, 3110, 7015, 3269, 1367, 6397, 10259, 8435, 10527, 11559, 11094, 2211, 1808, 7319, 48, 9547, 2560, 1228, 9438, 10787, 11800, 1820, 11406, 8966, 6159, 3012, 6109, 2796, 2203, 1652, 711, 7004, 1053, 8973, 5244, 1517, 9322, 11269, 900, 3888, 11133, 10736, 4949, 7616, 9974, 4746, 10270, 126, 2921, 6720, 6635, 6543, 1582, 4868, 42, 673, 2240, 7219, 1296, 11989, 7675, 8578, 11949, 989, 10541, 7687, 7085, 8487, 1004, 10236, 4703, 163, 9143, 4597, 6431, 12052, 2991, 11938, 4647, 3362, 2060, 11357, 12011, 6664, 5655, 7225, 5914, 9327, 4092, 5880, 6932, 3402, 5133, 9394, 11229, 5252, 9008, 1556, 6908, 4773, 3853, 8780, 10325, 7737, 1758, 7103, 11375, 12273, 8602, 3243, 6536, 7590, 8591, 11552, 6101, 3253, 9969, 9640, 4506, 3736, 6829, 10822, 9130, 9948, 3566, 2133, 3901, 6038, 7333, 6609, 3468, 4659, 625, 2700, 7738, 3443, 3060, 3388, 3526, 4418, 11911, 6232, 1730, 2558, 10340, 5344, 5286, 2190, 11562, 6199, 2482, 8756, 5387, 4101, 4609, 8605, 8226, 144, 5656, 8704, 2621, 5424, 10812, 2959, 11346, 6249, 1715, 4951, 9540, 1888, 3764, 39, 8219, 2080, 2502, 1469, 10550, 8709, 5601, 1093, 3784, 5041, 2058, 8399, 11448, 9639, 2059, 9878, 7405, 2496, 7918, 11594, 371, 7993, 3073, 10326, 40, 10004, 9245, 7987, 5603, 4051, 7894, 676, 11380, 7379, 6501, 4981, 2628, 3488, 10956, 7022, 6737, 9933, 7139, 2330, 3884, 5473, 7865, 6941, 5737, 5613, 9505, 11568, 11277, 2510, 6689, 386, 4462, 105, 2076, 10443, 119, 3955, 4370, 11505, 3672, 11439, 750, 3240, 3133, 754, 4013, 11929, 9210, 5378, 11881, 11018, 2818, 1851, 4966, 8181, 2688, 6205, 6814, 926, 2936, 4327, 10175, 7089, 6047, 9410, 10492, 8950, 2472, 6255, 728, 7569, 6056, 10432, 11036, 2452, 2811, 3787, 945, 8998, 1244, 8815, 11017, 11218, 5894, 4325, 4639, 3819, 9826, 7056, 6786, 8670, 5539, 7707, 1361, 9812, 2949, 11265, 10301, 9108, 478, 6489, 101, 1911, 9483, 3608, 11997, 10536, 812, 8915, 637, 8159, 5299, 9128, 3512, 8290, 7068, 7922, 3036, 4759, 2163, 3937, 3755, 11306, 7739, 4922, 11932, 424, 5538, 6228, 11131, 7778, 11974, 1097, 2890, 10027, 2569, 2250, 2352, 821, 2550, 11016, 7769, 136, 617, 3157, 5889, 9219, 6855, 120, 4405, 1825, 9635, 7214, 10261, 11393, 2441, 9562, 11176, 599, 2085, 11465, 7233, 6177, 4801, 9926, 9010, 4514, 9455, 11352, 11670, 6174, 7950, 9766, 6896, 11603, 3213, 8473, 9873, 2835, 10422, 3732, 7961, 1457, 10857, 8069, 832, 1628, 3410, 4900, 10855, 5111, 9543, 6325, 7431, 4083, 3072, 8847, 9853, 10122, 5259, 11413, 6556, 303, 1465, 3871, 4873, 5813, 10017, 6898, 3311, 5947, 8637, 5852, 3856, 928, 4933, 8530, 1871, 2184, 5571, 5879, 3481, 11597, 9511, 8153, 35, 2609, 5963, 8064, 1080, 12039, 8444, 3052, 3813, 11065, 6736, 8454, 2340, 7651, 1910, 10709, 2117, 9637, 6402, 6028, 2124, 7701, 2679, 5183, 6270, 7424, 2597, 6795, 9222, 10837, 280, 8583, 3270, 6753, 2354, 3779, 6102, 4732, 5926, 2497, 8640, 10289, 6107, 12127, 2958, 12287, 10292, 8086, 817, 4021, 2610, 1444, 5899, 11720, 3292, 2424, 5090, 7242, 5205, 5281, 9956, 2702, 6656, 735, 2243, 11656, 833, 3107, 6012, 6801, 1126, 6339, 5250, 10391, 9642, 5278, 3513, 9769, 3025, 779, 9433, 3392, 7437, 668, 10184, 8111, 6527, 6568, 10831, 6482, 8263, 5711, 9780, 467, 5462, 4425, 11999, 1205, 5015, 6918, 5096, 3827, 5525, 11579, 3518, 4875, 7388, 1931, 6615, 1541, 8708, 260, 3385, 4792, 4391, 5697, 7895, 2155, 7337, 236, 10635, 11534, 1906, 4793, 9527, 7239, 8354, 5121, 10662, 2311, 3346, 8556, 707, 1088, 4936, 678, 10245, 18, 5684, 960, 4459, 7957, 226, 2451, 6, 8874, 320, 6298, 8963, 8735, 2852, 2981, 1707, 5408, 5017, 9876, 9790, 2968, 1899, 6729, 4183, 5290, 10084, 7679, 7941, 8744, 5694, 3461, 4175, 5747, 5561, 3378, 5227, 952, 4319, 9810, 4356, 3088, 11118, 840, 6257, 486, 6000, 1342, 10382, 6017, 4798, 5489, 4498, 4193, 2306, 6521, 1475, 6372, 9029, 8037, 1625, 7020, 4740, 5730, 7956, 6351, 6494, 6917, 11405, 7487, 10202, 10155, 7666, 7556, 11509, 1546, 6571, 10199, 2265, 7327, 5824, 11396, 11581, 9722, 2251, 11199, 5356, 7408, 2861, 4003, 9215, 484, 7526, 9409, 12235, 6157, 9025, 2121, 10255, 2519, 9533, 3824, 8674, 11419, 10888, 4762, 11303, 4097, 2414, 6496, 9953, 10554, 808, 2999, 2130, 4286, 12078, 7445, 5132, 7915, 245, 5974, 4874, 7292, 7560, 10539, 9952, 9075, 2113, 3721, 10285, 10022, 9578, 8934, 11074, 9498, 294, 4711, 3391, 1377, 9072, 10189, 4569, 10890, 9909, 6923, 53, 4653, 439, 10253, 7028, 10207, 8343, 1141, 2556, 7601, 8150, 10630, 8648, 9832, 7951, 11245, 2131, 5765, 10343, 9781, 2718, 1419, 4531, 3844, 4066, 4293, 11657, 11525, 11353, 4313, 4869, 12186, 1611, 10892, 11489, 8833, 2393, 15, 10830, 5003, 17, 565, 5891, 12177, 11058, 10412, 8885, 3974, 10981, 7130, 5840, 10482, 8338, 6035, 6964, 1574, 10936, 2020, 2465, 8191, 384, 2642, 2729, 5399, 2175, 9396, 11987, 8035, 4375, 6611, 5010, 11812, 9131, 11427, 104, 6348, 9643, 6757, 12110, 5617, 10935, 541, 135, 3041, 7200, 6526, 5085, 12136, 842, 4129, 7685, 11079, 8426, 1008, 2725, 11772, 6058, 1101, 1950, 8424, 5688, 6876, 12005, 10079, 5335, 927, 1770, 273, 8377, 2271, 5225, 10283, 116, 11807, 91, 11699, 757, 1304, 7524, 6451, 8032, 8154, 7456, 4191, 309, 2318, 2292, 10393, 11639, 9481, 12238, 10594, 9569, 7912, 10368, 9889, 12244, 7179, 3924, 3188, 367, 2077, 336, 5384, 5631, 8596, 4621, 1775, 8866, 451, 6108, 1317, 6246, 8795, 5896, 7283, 3132, 11564, 4977, 12161, 7371, 1366, 12130, 10619, 3809, 5149, 6300, 2638, 4197, 1418, 10065, 4156, 8373, 8644, 10445, 882, 8158, 10173, 9763, 12191, 459, 2966, 3166, 405, 5000, 9311, 6404, 8986, 1551, 8175, 3630, 10766, 9265, 700, 8573, 9508, 6630, 11437, 11595, 5850, 3950, 4775, 11941, 1446, 6018, 3386, 11470, 5310, 5476, 553, 9474, 2586, 1431, 2741, 473, 11383, 4745, 836, 
    4062, 10666, 7727, 11752, 5534, 312, 4307, 4351, 5764, 8679, 8381, 8187, 5, 7395, 4363, 1152, 5421, 5231, 6473, 436, 7567, 8603, 6229, 8230};
    public static final int[] j = {2130970157};
    public static final int[] k = {R.attr.textAppearance};
    public static final int[] l = {R.attr.lineSpacingExtra};
    public static final int[] r = {R.attr.stateListAnimator};
    public static final eko s = new eko(28);

    static {
        byte b = 4;
        m = new gd7("STATE_REG", b);
        n = new gd7("STATE_COMPLETED", b);
        o = new gd7("STATE_CANCELLED", b);
        p = new gd7("NO_RESULT", b);
        q = new gd7("PARAM_CLAUSE_0", b);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A(android.content.Context r12) {
        /*
            java.lang.String r0 = "account"
            java.lang.Object r0 = r12.getSystemService(r0)
            android.accounts.AccountManager r0 = (android.accounts.AccountManager) r0
            java.lang.String r1 = G(r12)
            android.accounts.Account r2 = F(r12)
            boolean r3 = Q(r12)
            if (r3 == 0) goto L18
            r12 = 2
            return r12
        L18:
            java.lang.String[] r3 = com.opera.android.OperaApplication.K
            android.content.Context r3 = r12.getApplicationContext()
            com.opera.android.OperaApplication r3 = (com.opera.android.OperaApplication) r3
            com.opera.android.settings.SettingsManager r3 = r3.J()
            java.lang.String r4 = "eula_accepted.gdpr"
            boolean r3 = r3.i(r4)
            r4 = 3
            if (r3 == 0) goto L108
            android.content.pm.PackageManager r3 = r12.getPackageManager()
            java.lang.String r5 = r12.getPackageName()
            r6 = 0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r5, r6)     // Catch: java.lang.Throwable -> L108
            int r3 = r3.flags
            r5 = r3 & 1
            r7 = 1
            if (r5 == 0) goto Le0
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto Le0
            java.lang.String r3 = "osp_scheduler"
            android.content.SharedPreferences r3 = r12.getSharedPreferences(r3, r6)
            java.lang.String r5 = "first.seen"
            boolean r6 = r3.contains(r5)
            if (r6 != 0) goto Lce
            android.content.SharedPreferences$Editor r0 = r3.edit()
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r1)
            r0.apply()
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class<com.opera.android.analytics.OspAccountService> r1 = com.opera.android.analytics.OspAccountService.class
            r0.<init>(r12, r1)
            android.content.pm.PackageManager r2 = r12.getPackageManager()
            r2.setComponentEnabledSetting(r0, r7, r7)
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r2 = r12.getSystemService(r0)
            android.app.job.JobScheduler r2 = (android.app.job.JobScheduler) r2
            android.app.job.JobInfo$Builder r3 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r5 = new android.content.ComponentName
            r5.<init>(r12, r1)
            r1 = 1001(0x3e9, float:1.403E-42)
            r3.<init>(r1, r5)
            r5 = 280800000(0x10bcab00, double:1.387336334E-315)
            android.app.job.JobInfo$Builder r1 = r3.setMinimumLatency(r5)
            long r5 = defpackage.xf8.w
            android.app.job.JobInfo$Builder r1 = r1.setOverrideDeadline(r5)
            android.app.job.JobInfo$Builder r1 = r1.setPersisted(r7)
            android.app.job.JobInfo r1 = r1.build()
            r2.schedule(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<com.opera.android.analytics.OspPeriodicUploadService> r2 = com.opera.android.analytics.OspPeriodicUploadService.class
            r1.<init>(r12, r2)
            android.content.pm.PackageManager r2 = r12.getPackageManager()
            r2.setComponentEnabledSetting(r1, r7, r7)
            java.lang.Object r12 = r12.getSystemService(r0)
            android.app.job.JobScheduler r12 = (android.app.job.JobScheduler) r12
            android.app.job.JobInfo$Builder r0 = new android.app.job.JobInfo$Builder
            r2 = 1010(0x3f2, float:1.415E-42)
            r0.<init>(r2, r1)
            r1 = 21600000(0x1499700, double:1.0671818E-316)
            android.app.job.JobInfo$Builder r0 = r0.setPeriodic(r1)
            android.app.job.JobInfo$Builder r0 = r0.setPersisted(r7)
            android.app.job.JobInfo$Builder r0 = r0.setRequiredNetworkType(r7)
            android.app.job.JobInfo r0 = r0.build()
            r12.schedule(r0)
            return r4
        Lce:
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            long r5 = r3.getLong(r5, r10)
            long r8 = r8 - r5
            r5 = 259200000(0xf731400, double:1.280618154E-315)
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 < 0) goto L108
        Le0:
            r12 = 0
            boolean r12 = r0.addAccountExplicitly(r2, r12, r12)
            if (r12 == 0) goto L108
            android.content.ContentResolver.setIsSyncable(r2, r1, r7)
            android.content.ContentResolver.setSyncAutomatically(r2, r1, r7)
            int r12 = kwk.b
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.String r3 = "op"
            java.lang.String r4 = "periodic"
            r12.putString(r3, r4)
            r3 = 7200(0x1c20, double:3.5573E-320)
            android.content.ContentResolver.addPeriodicSync(r2, r1, r12, r3)
            java.lang.String r12 = "account.flagged"
            java.lang.String r1 = "1"
            r0.setUserData(r2, r12, r1)
            return r7
        L108:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.A(android.content.Context):int");
    }

    public static final int A0(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 - i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public static final tsd B(ikc ikcVar) {
        tsd tsdVar = new tsd(ikcVar.g());
        tsdVar.l.s(ikcVar, new ug(new nna((Object) tsdVar, (byte) 29), (byte) 25));
        return tsdVar;
    }

    public static final e48 B0(b3m b3mVar, Function1 function1, Object obj, ih5 ih5Var) {
        e48 e48Var;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.U(-422486566, b3mVar);
        if (b3mVar.g()) {
            vt9Var.W(-212166497);
            vt9Var.p(false);
            e48Var = ((Boolean) function1.invoke(obj)).booleanValue() ? e48.b : ((Boolean) function1.invoke(b3mVar.c())).booleanValue() ? e48.c : e48.a;
        } else {
            vt9Var.W(-211886815);
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = hyg.k(Boolean.FALSE);
                vt9Var.g0(objK);
            }
            afe afeVar = (afe) objK;
            Object value = b3mVar.e.getValue();
            if (((Boolean) function1.invoke(b3mVar.c())).booleanValue() || (value != null && ((Boolean) function1.invoke(value)).booleanValue())) {
                afeVar.setValue(Boolean.TRUE);
            }
            e48Var = ((Boolean) function1.invoke(obj)).booleanValue() ? e48.b : ((value == null || !((Boolean) function1.invoke(value)).booleanValue()) && ((Boolean) afeVar.getValue()).booleanValue()) ? e48.c : e48.a;
            vt9Var.p(false);
        }
        vt9Var.p(false);
        return e48Var;
    }

    public static void E(Context context, boolean z) {
        Context applicationContext = context.getApplicationContext();
        int iA = A(applicationContext);
        if (iA == 1 || (iA == 2 && !z)) {
            p0(applicationContext);
        }
    }

    public static final boolean E0(ode odeVar, Object obj) {
        if (odeVar.i() && Intrinsics.a(odeVar.g(), obj)) {
            return false;
        }
        odeVar.r(obj);
        return true;
    }

    public static Account F(Context context) {
        String packageName = context.getPackageName();
        return new Account(packageName, sko.u(packageName, ".ping"));
    }

    public static final boolean F0(pde pdeVar, Object obj) {
        if (pdeVar.i() && Intrinsics.a(pdeVar.g(), obj)) {
            return false;
        }
        pdeVar.r(obj);
        return true;
    }

    public static String G(Context context) {
        return sko.u(context.getPackageName(), ".ping.provider");
    }

    public static final boolean G0(kze kzeVar, Object obj) {
        if (Intrinsics.a(kzeVar.g(), obj)) {
            return false;
        }
        kzeVar.r(obj);
        return true;
    }

    public static final ArrayList H(shb shbVar) {
        m3c m3cVarD0 = ((o1d) shbVar).D0();
        boolean zS = S(m3cVarD0);
        List listO = m3cVarD0.o();
        bee beeVar = (bee) listO;
        ArrayList arrayList = new ArrayList(((dfe) beeVar.b).c);
        int size = listO.size();
        for (int i2 = 0; i2 < size; i2++) {
            m3c m3cVar = (m3c) beeVar.get(i2);
            arrayList.add(zS ? m3cVar.l() : m3cVar.m());
        }
        return arrayList;
    }

    public static final Object J(bza bzaVar, xm5 xm5Var) {
        Object obj = bzaVar.o.a.get(xm5Var);
        if (obj != null) {
            return obj;
        }
        Object obj2 = bzaVar.q.d.a.get(xm5Var);
        return obj2 == null ? xm5Var.a : obj2;
    }

    public static final Object K(vrf vrfVar, xm5 xm5Var) {
        Object obj = vrfVar.i.a.get(xm5Var);
        return obj == null ? xm5Var.a : obj;
    }

    public static final Object M(pfd pfdVar) {
        Object objP = pfdVar.p();
        v2c v2cVar = objP instanceof v2c ? (v2c) objP : null;
        if (v2cVar != null) {
            return v2cVar.o;
        }
        return null;
    }

    public static final Object N(Optional optional, Object obj) {
        return optional.isPresent() ? optional.get() : obj;
    }

    public static ovf O(Context context, String str) {
        PackageInfo packageInfoU = r9n.u(context, str, 134217728L);
        if (packageInfoU == null) {
            return null;
        }
        boolean zHasMultipleSigners = packageInfoU.signingInfo.hasMultipleSigners();
        SigningInfo signingInfo = packageInfoU.signingInfo;
        return zHasMultipleSigners ? new ovf(packageInfoU, signingInfo.getApkContentsSigners()) : new ovf(packageInfoU, signingInfo.getSigningCertificateHistory());
    }

    public static final void P(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = fx5.a.iterator();
        while (it.hasNext()) {
            try {
                ((ex5) it.next()).handleException(th, coroutineContext);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    wf8.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            wf8.a(th, new k77(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    public static boolean Q(Context context) {
        try {
            return ((AccountManager) context.getSystemService("account")).getUserData(F(context), "account.flagged") != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static final boolean S(m3c m3cVar) {
        int iOrdinal = m3cVar.G.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            h9o.p();
                            return false;
                        }
                        m3c m3cVarU = m3cVar.u();
                        if (m3cVarU != null) {
                            return S(m3cVarU);
                        }
                        qp2.o("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final tsd V(ikc ikcVar, Function1 function1) {
        tsd tsdVar = new tsd(function1.invoke(ikcVar.g()));
        tsdVar.l.s(ikcVar, new ug(new jkc(tsdVar, function1, (byte) 1), (byte) 25));
        return tsdVar;
    }

    public static final Object W(ekc ekcVar) {
        ihb ihbVar = new ihb();
        ekcVar.k(ihbVar);
        ekcVar.p(ihbVar);
        return ekcVar.g();
    }

    public static final wnm X(Object obj, ekc ekcVar, ekc ekcVar2, ekc ekcVar3, cr9 cr9Var) {
        return new wnm(obj, Arrays.asList(ekcVar, ekcVar2, ekcVar3), new hv(ekcVar, ekcVar2, ekcVar3, (byte) 25), new i51((Object) cr9Var, (Object) ekcVar, (Object) ekcVar2, (Object) ekcVar3, (byte) 12));
    }

    public static final wnm Y(Object obj, ekc ekcVar, ekc ekcVar2, Function2 function2) {
        return new wnm(obj, Arrays.asList(ekcVar, ekcVar2), new gv8(ekcVar, ekcVar2, (byte) 19), new hv(function2, ekcVar, ekcVar2, (byte) 23));
    }

    public static void Z(short[] sArr, int i2) {
        int i3 = 1;
        int i4 = 1 << i2;
        int i5 = i4;
        while (i3 < i4) {
            int i6 = i5 >> 1;
            int i7 = 0;
            int i8 = 0;
            while (i7 < i3) {
                short s2 = h[i3 + i7];
                int i9 = i8 + i6;
                for (int i10 = i8; i10 < i9; i10++) {
                    int i11 = sArr[i10] & 65535;
                    int i12 = i10 + i6;
                    int iA0 = a0(sArr[i12], s2);
                    int i13 = (i11 + iA0) - 12289;
                    sArr[i10] = (short) (i13 + ((-(i13 >>> 31)) & 12289));
                    int i14 = i11 - iA0;
                    sArr[i12] = (short) (i14 + ((-(i14 >>> 31)) & 12289));
                }
                i7++;
                i8 += i5;
            }
            i3 <<= 1;
            i5 = i6;
        }
    }

    public static final void a(n01 n01Var, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1291871009);
        int i3 = (vt9Var.f(n01Var) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            boolean z = (i3 & 14) == 4;
            Object objK = vt9Var.K();
            if (z || objK == hh5.a) {
                objK = qyn.B(n01Var);
                vt9Var.g0(objK);
            }
            String str = (String) objK;
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            j(iza.a(k1g.A(n01Var.a), vt9Var), null, mpj.h(z7eVar, 16.0f), null, null, 0.0f, null, vt9Var, 440, 120);
            vt9Var.W(1270815496);
            qf1 qf1Var = new qf1();
            qf1Var.b(k1g.E(n01Var.a, vt9Var));
            qf1Var.b(" ");
            hp7 hp7Var = abm.a;
            rwj rwjVar = ((wam) vt9Var.j(hp7Var)).n.a;
            hp7 hp7Var2 = ua5.a;
            int iG = qf1Var.g(rwj.a(rwjVar, ((sa5) vt9Var.j(hp7Var2)).q, ki9.i, 65530));
            try {
                qf1Var.b(str);
                qf1Var.d(iG);
                sf1 sf1VarH = qf1Var.h();
                vt9Var.p(false);
                ijl.c(sf1VarH, null, ((sa5) vt9Var.j(hp7Var2)).s, 0L, 0L, null, 0L, 0, false, 1, 0, null, null, ((wam) vt9Var.j(hp7Var)).l, vt9Var, 0, 24576, 245754);
                vt9Var = vt9Var;
                vt9Var.p(true);
            } catch (Throwable th) {
                qf1Var.d(iG);
                throw th;
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new k13(n01Var, i2, (byte) 0);
        }
    }

    public static int a0(int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = (((((i4 * 12287) & 65535) * 12289) + i4) >>> 16) - 12289;
        return i5 + ((-(i5 >>> 31)) & 12289);
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x085a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.b3m r33, kotlin.jvm.functions.Function1 r34, defpackage.c8e r35, defpackage.x48 r36, defpackage.vh8 r37, kotlin.jvm.functions.Function2 r38, defpackage.ue5 r39, defpackage.ih5 r40, int r41) {
        /*
            Method dump skipped, instructions count: 2219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.b(b3m, kotlin.jvm.functions.Function1, c8e, x48, vh8, kotlin.jvm.functions.Function2, ue5, ih5, int):void");
    }

    public static final void c(cfe cfeVar, c8e c8eVar, x48 x48Var, vh8 vh8Var, String str, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        String str2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(657024243);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vt9Var.f(cfeVar) : vt9Var.h(cfeVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(x48Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.f(vh8Var) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i4 |= vt9Var.h(ue5Var) ? 131072 : 65536;
        }
        if (vt9Var.N(i4 & 1, (74899 & i4) != 74898)) {
            b3m b3mVarS = r9h.s(cfeVar, "AnimatedVisibility", vt9Var, (i4 & 14) | ((i4 >> 9) & 112));
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = h50.o;
                vt9Var.g0(objK);
            }
            int i5 = i4 << 3;
            f(b3mVarS, (Function1) objK, c8eVar, x48Var, vh8Var, ue5Var, vt9Var, (i5 & 896) | 48 | (i5 & 7168) | (57344 & i5) | (i5 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            vt9Var.Q();
            str2 = str;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new od1(cfeVar, c8eVar, x48Var, vh8Var, str2, ue5Var, i2);
        }
    }

    public static final void d(boolean z, c8e c8eVar, x48 x48Var, vh8 vh8Var, String str, ue5 ue5Var, ih5 ih5Var, int i2, int i3) {
        x48 x48Var2;
        int i4;
        vh8 vh8VarA;
        int i5;
        String str2;
        x48 x48Var3;
        int i6;
        x48 x48VarA;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1448730565);
        int i7 = i2 | (vt9Var.g(z) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i7 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 = i7 | 384;
            x48Var2 = x48Var;
        } else {
            x48Var2 = x48Var;
            i4 = i7 | (vt9Var.f(x48Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            vh8VarA = vh8Var;
        } else {
            vh8VarA = vh8Var;
            i5 = i4 | (vt9Var.f(vh8VarA) ? 2048 : 1024);
        }
        int i10 = i5 | 24576;
        if (vt9Var.N(i10 & 1, (74899 & i10) != 74898)) {
            if (i8 != 0) {
                x48 x48VarE = o48.e(null, 3);
                Map map = tan.a;
                x48VarA = x48VarE.a(o48.c(rbe.j, rm5.R(0.0f, 400.0f, new gcb(4294967297L), 1), h50.x, true));
                i6 = i9;
            } else {
                i6 = i9;
                x48VarA = x48Var2;
            }
            if (i6 != 0) {
                vh8VarA = o48.i().a(o48.f(null, 3));
            }
            b3m b3mVarV = r9h.v(Boolean.valueOf(z), "AnimatedVisibility", vt9Var, (i10 & 14) | 48, 0);
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = h50.m;
                vt9Var.g0(objK);
            }
            int i11 = i10 << 3;
            f(b3mVarV, (Function1) objK, c8eVar, x48VarA, vh8VarA, ue5Var, vt9Var, (i11 & 896) | 48 | (i11 & 7168) | (i11 & 57344) | 1572864);
            x48Var3 = x48VarA;
            str2 = "AnimatedVisibility";
        } else {
            vt9Var.Q();
            str2 = str;
            x48Var3 = x48Var2;
        }
        vh8 vh8Var2 = vh8VarA;
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ge1(z, c8eVar, x48Var3, vh8Var2, str2, ue5Var, i2, i3, (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(boolean r16, defpackage.c8e r17, defpackage.x48 r18, defpackage.vh8 r19, java.lang.String r20, defpackage.ue5 r21, defpackage.ih5 r22, int r23, int r24) {
        /*
            r7 = r23
            r14 = r22
            vt9 r14 = (defpackage.vt9) r14
            r0 = 1799879339(0x6b47faab, float:2.4175998E26)
            r14.Y(r0)
            r1 = r16
            boolean r0 = r14.g(r1)
            if (r0 == 0) goto L17
            r0 = 32
            goto L19
        L17:
            r0 = 16
        L19:
            r0 = r0 | r7
            r0 = r0 | 384(0x180, float:5.38E-43)
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            r11 = r18
            if (r2 != 0) goto L2e
            boolean r2 = r14.f(r11)
            if (r2 == 0) goto L2b
            r2 = 2048(0x800, float:2.87E-42)
            goto L2d
        L2b:
            r2 = 1024(0x400, float:1.435E-42)
        L2d:
            r0 = r0 | r2
        L2e:
            r2 = r24 & 8
            if (r2 == 0) goto L37
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L34:
            r3 = r19
            goto L49
        L37:
            r3 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L34
            r3 = r19
            boolean r4 = r14.f(r3)
            if (r4 == 0) goto L46
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L48
        L46:
            r4 = 8192(0x2000, float:1.148E-41)
        L48:
            r0 = r0 | r4
        L49:
            r4 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r4
            r4 = 599185(0x92491, float:8.39637E-40)
            r4 = r4 & r0
            r5 = 599184(0x92490, float:8.39636E-40)
            r6 = 0
            if (r4 == r5) goto L58
            r4 = 1
            goto L59
        L58:
            r4 = r6
        L59:
            r5 = r0 & 1
            boolean r4 = r14.N(r5, r4)
            if (r4 == 0) goto Lad
            if (r2 == 0) goto L73
            r2 = 0
            r3 = 3
            vh8 r2 = defpackage.o48.f(r2, r3)
            vh8 r3 = defpackage.o48.j()
            vh8 r2 = r2.a(r3)
            r12 = r2
            goto L74
        L73:
            r12 = r3
        L74:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            int r3 = r0 >> 3
            r3 = r3 & 14
            r3 = r3 | 48
            java.lang.String r4 = "AnimatedVisibility"
            b3m r8 = r9h.v(r2, r4, r14, r3, r6)
            java.lang.Object r2 = r14.K()
            zpa r3 = hh5.a
            if (r2 != r3) goto L91
            h50 r2 = defpackage.h50.n
            r14.g0(r2)
        L91:
            r9 = r2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = 432(0x1b0, float:6.05E-43)
            r3 = r3 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            r3 = r3 | r0
            r0 = 1572864(0x180000, float:2.204052E-39)
            r15 = r3 | r0
            z7e r10 = defpackage.z7e.b
            r13 = r21
            f(r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = r4
            r2 = r10
            r4 = r12
            goto Lb5
        Lad:
            r14.Q()
            r2 = r17
            r5 = r20
            r4 = r3
        Lb5:
            znh r10 = r14.r()
            if (r10 == 0) goto Lc9
            ge1 r0 = new ge1
            r9 = 1
            r3 = r18
            r6 = r21
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.d = r0
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.e(boolean, c8e, x48, vh8, java.lang.String, ue5, ih5, int, int):void");
    }

    public static final void f(b3m b3mVar, Function1 function1, c8e c8eVar, x48 x48Var, vh8 vh8Var, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        x48 x48Var2;
        vh8 vh8Var2;
        ue5 ue5Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-497872534);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(b3mVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            x48Var2 = x48Var;
            i3 |= vt9Var.f(x48Var2) ? 2048 : 1024;
        } else {
            x48Var2 = x48Var;
        }
        if ((i2 & 24576) == 0) {
            vh8Var2 = vh8Var;
            i3 |= vt9Var.f(vh8Var2) ? 16384 : 8192;
        } else {
            vh8Var2 = vh8Var;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            ue5Var2 = ue5Var;
            i4 |= vt9Var.h(ue5Var2) ? 1048576 : 524288;
        } else {
            ue5Var2 = ue5Var;
        }
        if (vt9Var.N(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z || objK == zpaVar) {
                objK = new ie1(function1, b3mVar);
                vt9Var.g0(objK);
            }
            c8e c8eVarF = yi4.F(c8eVar, (cr9) objK);
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = je1.j;
                vt9Var.g0(objK2);
            }
            int i7 = i6 | 196608 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            b(b3mVar, function1, c8eVarF, x48Var2, vh8Var2, (Function2) objK2, ue5Var2, vt9Var, i7 | (29360128 & i8) | (i8 & 234881024));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new od1(b3mVar, function1, c8eVar, x48Var, vh8Var, ue5Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d06 f0() {
        fbd fbdVar;
        pad padVar = new pad((byte) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0));
        wad wadVar = (wad) padVar.b;
        z4o.I(wadVar == null, "Key strength was already set to %s", wadVar);
        xad xadVar = xad.b;
        padVar.b = xadVar;
        d06 d06Var = new d06();
        n58 n58Var = n58.b;
        o58 o58Var = (o58) padVar.c;
        z4o.I(o58Var == null, "key equivalence was already set to %s", o58Var);
        padVar.c = n58Var;
        int i2 = fbd.j;
        wad wadVar2 = (wad) padVar.b;
        xad xadVar2 = xad.a;
        if (((xad) cs5.G(wadVar2, xadVar2)) == xadVar2) {
            fbdVar = new fbd(padVar, n9a.h);
        } else {
            if (((xad) cs5.G((wad) padVar.b, xadVar2)) != xadVar) {
                t40.h();
                throw null;
            }
            fbdVar = new fbd(padVar, zpa.f);
        }
        d06Var.a = fbdVar;
        return d06Var;
    }

    public static final void g(utm utmVar, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1511791066);
        int i3 = (vt9Var.f(utmVar) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            db5 db5VarA = cb5.a(new x62(20.0f, true, new t40((byte) 19)), rbe.o, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            Long l2 = utmVar.a;
            g1b g1bVar = utmVar.b;
            l(l2, vt9Var, 0);
            if (g1bVar.isEmpty()) {
                vt9Var.W(1697144126);
            } else {
                vt9Var.W(-637991161);
                o(g1bVar, vt9Var, 0);
            }
            vt9Var.p(false);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new i13(utmVar, c8eVar, i2, (byte) 0);
        }
    }

    public static final void g0(ekc ekcVar, ndc ndcVar, f7f f7fVar) {
        lqh lqhVar = new lqh();
        lqhVar.a = ekcVar.i();
        ekcVar.j(ndcVar, new qg(lqhVar, f7fVar, (byte) 1));
    }

    public static p04 h(int i2, h04 h04Var, Function1 function1, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            h04Var = h04.a;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        if (i2 == -2) {
            if (h04Var != h04.a) {
                return new pl5(1, h04Var, function1);
            }
            or4.Qo.getClass();
            return new p04(nr4.b, function1);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? h04Var == h04.a ? new p04(i2, function1) : new pl5(i2, h04Var, function1) : new p04(Integer.MAX_VALUE, function1) : h04Var == h04.a ? new p04(0, function1) : new pl5(1, h04Var, function1);
        }
        if (h04Var == h04.a) {
            return new pl5(1, h04.b, function1);
        }
        qp2.o("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final void h0(ekc ekcVar, f7f f7fVar) {
        lqh lqhVar = new lqh();
        lqhVar.a = ekcVar.i();
        ekcVar.k(new qg(lqhVar, f7fVar, (byte) 2));
    }

    public static q27 i() {
        return new q27(1.0f, 1.0f);
    }

    public static final void i0(ekc ekcVar, ndc ndcVar, ViewGroup viewGroup, List list, f7f f7fVar) {
        ArrayList arrayListJ = j95.j(new p59[]{new el7(viewGroup, (byte) 0), new r97(viewGroup)});
        if (list != null) {
            arrayListJ.addAll(list);
        }
        ekcVar.j(ndcVar, new q59(f7fVar, CollectionsKt.k0(arrayListJ), (byte) 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.hyf r17, java.lang.String r18, defpackage.c8e r19, defpackage.td3 r20, defpackage.kr5 r21, float r22, defpackage.kh3 r23, defpackage.ih5 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.j(hyf, java.lang.String, c8e, td3, kr5, float, kh3, ih5, int, int):void");
    }

    public static final void j0(ikc ikcVar, View view, f7f f7fVar) {
        tu4 tu4Var = new tu4(ikcVar, f7fVar, (byte) 2);
        view.addOnAttachStateChangeListener(tu4Var);
        if (view.isAttachedToWindow()) {
            tu4Var.onViewAttachedToWindow(view);
        }
    }

    public static final void k(final hdg hdgVar, int i2, Function0 function0, ih5 ih5Var, int i3, int i4) {
        Function0 function02;
        int i5;
        int i6;
        Function1 function1;
        boolean z;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(315266112);
        int i7 = i3 | (vt9Var.f(hdgVar) ? 32 : 16);
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 = i7 | 3072;
            function02 = function0;
        } else {
            function02 = function0;
            i5 = i7 | (vt9Var.h(function02) ? 2048 : 1024);
        }
        final byte b = 0;
        final byte b2 = 1;
        if (vt9Var.N(i5 & 1, (i5 & 1169) != 1168)) {
            Function0 function03 = i8 != 0 ? null : function02;
            t0g t0gVar = hdgVar.b;
            t0g t0gVar2 = hdgVar.d;
            ey5 ey5Var = (ey5) t0gVar.getValue();
            g1b g1bVar = (g1b) hdgVar.c.getValue();
            int i9 = i5 & 112;
            boolean z2 = i9 == 32;
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z2 || objK == zpaVar) {
                objK = new Function1() { // from class: gdg
                    public final Object invoke(Object obj) {
                        byte b3 = b;
                        hdg hdgVar2 = hdgVar;
                        switch (b3) {
                            case 0:
                                kg9.a(hdgVar2.e);
                                hdgVar2.b.setValue((ey5) obj);
                                hdgVar2.b(null);
                                break;
                            default:
                                hdgVar2.a.setValue((String) obj);
                                hdgVar2.b(null);
                                break;
                        }
                        return Unit.a;
                    }
                };
                vt9Var.g0(objK);
            }
            Function1 function12 = (Function1) objK;
            i39 i39Var = mpj.a;
            if (((shk) t0gVar2.getValue()) != null) {
                i6 = i9;
                function1 = function12;
                z = true;
            } else {
                i6 = i9;
                function1 = function12;
                z = false;
            }
            int i10 = i6;
            ky5.b(ey5Var, g1bVar, function1, i39Var, z, vt9Var, 3072, 0);
            String str = (String) hdgVar.a.getValue();
            boolean z3 = i10 == 32;
            Object objK2 = vt9Var.K();
            if (z3 || objK2 == zpaVar) {
                objK2 = new Function1() { // from class: gdg
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        hdg hdgVar2 = hdgVar;
                        switch (b3) {
                            case 0:
                                kg9.a(hdgVar2.e);
                                hdgVar2.b.setValue((ey5) obj);
                                hdgVar2.b(null);
                                break;
                            default:
                                hdgVar2.a.setValue((String) obj);
                                hdgVar2.b(null);
                                break;
                        }
                        return Unit.a;
                    }
                };
                vt9Var.g0(objK2);
            }
            vt9Var = vt9Var;
            Function0 function04 = function03;
            sgb.g(str, (Function1) objK2, (ey5) hdgVar.b.getValue(), hdgVar.e, (shk) t0gVar2.getValue(), null, i2, function04, vt9Var, (i5 << 12) & 33030144, 32);
            function02 = function04;
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new dy5(hdgVar, i2, function02, i3, i4);
        }
    }

    public static final void k0(dwj dwjVar, o02 o02Var) {
        c04 c04VarU = dwjVar.u();
        if (c04VarU.x()) {
            qp2.o("Buffer is empty");
            return;
        }
        cxi cxiVar = c04VarU.a;
        byte[] bArr = cxiVar.a;
        int i2 = cxiVar.b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, cxiVar.c - i2);
        o02Var.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i2;
        if (iPosition != 0) {
            if (iPosition < 0) {
                qp2.n("Returned negative read bytes count");
            } else if (iPosition <= cxiVar.b()) {
                c04VarU.skip(iPosition);
            } else {
                qp2.n("Returned too many bytes");
            }
        }
    }

    public static final void l(Long l2, ih5 ih5Var, int i2) {
        String strValueOf;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1000929386);
        int i3 = i2 | (vt9Var.f(l2) ? 4 : 2);
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            db5 db5VarA = cb5.a(b72.c, rbe.o, vt9Var, 48);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            String strQ = uyg.q((shk) ahk.Q0.getValue(), vt9Var);
            hp7 hp7Var = abm.a;
            ikl iklVar = ((wam) vt9Var.j(hp7Var)).l;
            hp7 hp7Var2 = ua5.a;
            ijl.b(strQ, null, ((sa5) vt9Var.j(hp7Var2)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var, 0, 0, 131066);
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            j(iza.a(k1g.A(l01.e), vt9Var), null, mpj.h(z7eVar, 16.0f), null, null, 0.0f, null, vt9Var, 440, 120);
            if (l2 == null || (strValueOf = String.valueOf(l2.longValue())) == null) {
                strValueOf = "";
            }
            ijl.b(strValueOf, null, ((sa5) vt9Var.j(hp7Var2)).q, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, ((wam) vt9Var.j(hp7Var)).d, vt9Var, 0, 24576, 114682);
            vt9Var = vt9Var;
            vt9Var.p(true);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new whf(l2, i2, (byte) 10);
        }
    }

    public static int l0(bq4 bq4Var, int i2, int i3, int i4) {
        z4o.w(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        Math.addExact(Math.addExact(i5, i6), 1 << i4);
        if (bq4Var.b() < i2) {
            return -1;
        }
        int i7 = bq4Var.i(i2);
        if (i7 == i5) {
            if (bq4Var.b() < i3) {
                return -1;
            }
            int i8 = bq4Var.i(i3);
            i7 += i8;
            if (i8 == i6) {
                if (bq4Var.b() < i4) {
                    return -1;
                }
                return bq4Var.i(i4) + i7;
            }
        }
        return i7;
    }

    public static final void m(c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        c8e c8eVar2;
        ue5 ue5Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(790527681);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                t0g t0gVar = new t0g(null, qs7.g);
                vt9Var.g0(t0gVar);
                objK = t0gVar;
            }
            afe afeVar = (afe) objK;
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = new ox0(afeVar, (byte) 15);
                vt9Var.g0(objK2);
            }
            Function0 function0 = (Function0) objK2;
            gog gogVar = sw6.a;
            fb3 fb3VarH = w7d.h(ic4.c, vt9Var, 6);
            c8eVar2 = c8eVar;
            ue5Var2 = ue5Var;
            kfo.d(new k7h[]{vfl.b.a(j14.f0(function0, vt9Var, 2)), vfl.a.a(fb3VarH)}, gyg.P(1070596993, new c39(c8eVar2, afeVar, ue5Var2, fb3VarH, function0, (byte) 5), vt9Var), vt9Var, 56);
        } else {
            c8eVar2 = c8eVar;
            ue5Var2 = ue5Var;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fb1(c8eVar2, ue5Var2, i2, (byte) 3);
        }
    }

    public static final hdg m0(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        if (objK == hh5.a) {
            objK = new hdg();
            vt9Var.g0(objK);
        }
        return (hdg) objK;
    }

    public static final void n(c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(155925518);
        int i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        byte b = 1;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            boolean z = vt9Var.j(vfl.a) != null;
            boolean z2 = vt9Var.j(vfl.b) != null;
            if (z) {
                if (z2) {
                    vt9Var.W(-1977187922);
                    tfd tfdVarC = nr3.c(rbe.b, true);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVar);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(m3c.S);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, tfdVarC, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var);
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    ue5Var.invoke(vt9Var, 6);
                    vt9Var.p(true);
                    vt9Var.p(false);
                } else {
                    vt9Var.W(-1976997706);
                    j14.f(c8eVar, ue5Var, vt9Var, i3 & 126);
                    vt9Var.p(false);
                }
            } else if (z2) {
                vt9Var.W(-1976846922);
                sw6.d(c8eVar, ue5Var, vt9Var, i3 & 126);
                vt9Var.p(false);
            } else {
                vt9Var.W(-1976716505);
                m(c8eVar, ue5Var, vt9Var, i3 & 126);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new d8c(c8eVar, ue5Var, i2, b);
        }
    }

    public static void n0(Context context, lkk lkkVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        int iA = A(applicationContext);
        if (iA == 3) {
            ComponentName componentName = new ComponentName(applicationContext, (Class<?>) OspSingleUploadService.class);
            applicationContext.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            ((JobScheduler) applicationContext.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(1011, componentName).setRequiredNetworkType(1).build());
            return;
        }
        if (iA == 1) {
            p0(applicationContext);
        }
        if (z) {
            OSPPingReceiver.a(applicationContext, lkkVar, true);
            return;
        }
        int i2 = kwk.b;
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("expedited", true);
        bundle.putString("op", "ui");
        if (lkkVar != null) {
            bundle.putInt("sub", lkkVar.a);
        }
        ContentResolver.requestSync(F(applicationContext), G(applicationContext), bundle);
    }

    public static final void o(g1b g1bVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1147305657);
        int i3 = (vt9Var.f(g1bVar) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            sd3 sd3Var = rbe.l;
            x62 x62Var = new x62(24.0f, true, new t40((byte) 19));
            c8e c8eVarS0 = oup.s0(z7e.b, oup.q0(vt9Var), false, true);
            o9i o9iVarA = m9i.a(x62Var, sd3Var, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarS0);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            vt9Var.W(1851059559);
            Iterator it = g1bVar.iterator();
            while (it.hasNext()) {
                a((n01) it.next(), vt9Var, 0);
            }
            vt9Var.p(false);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new j13(g1bVar, i2, (byte) 0);
        }
    }

    public static final Object o0(ekc ekcVar) {
        Object objW = W(ekcVar);
        if (ekcVar.i()) {
            return objW;
        }
        qp2.n("LiveData has no value");
        return null;
    }

    public static void p0(Context context) {
        int i2 = kwk.b;
        Bundle bundle = new Bundle();
        bundle.putBoolean("ignore_settings", true);
        bundle.putString("op", "ping");
        bundle.putLong("ts", System.currentTimeMillis());
        ContentResolver.requestSync(F(context), G(context), bundle);
    }

    public static void q0(View view, float f) throws Resources.NotFoundException {
        int integer = view.getResources().getInteger(2131492866);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, 2130970866, -2130970867}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void r(zg zgVar) throws Resources.NotFoundException {
        TypedValue typedValueC;
        View view = (View) zgVar.b;
        if (view instanceof TextView) {
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes((AttributeSet) zgVar.c, l, zgVar.a, 0);
            TypedValue typedValue = new TypedValue();
            ff2 ff2Var = ff2.e;
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return;
            }
            TextView textView = (TextView) view;
            int[] iArr = j;
            ff2 ff2VarA = ff2.a(zgVar, iArr);
            ff2 ff2VarA2 = ff2.a(zgVar, k);
            if (ff2VarA == null && ff2VarA2 == null) {
                return;
            }
            Context context = view.getContext();
            if (ff2VarA != null) {
                typedValueC = ff2VarA.c(context);
                if (typedValueC == null) {
                    return;
                }
            } else {
                TypedValue typedValueC2 = ff2VarA2.c(context);
                if (typedValueC2 == null) {
                    return;
                }
                int i2 = typedValueC2.resourceId;
                TypedValue typedValue2 = new TypedValue();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, iArr);
                typedArrayObtainStyledAttributes2.getValue(0, typedValue2);
                typedArrayObtainStyledAttributes2.recycle();
                typedValueC = typedValue2;
            }
            if (typedValueC.type != 5) {
                return;
            }
            xih.s(textView, ff2.g(context, typedValueC));
        }
    }

    public static void r0(TextView textView, int i2) throws Resources.NotFoundException {
        textView.setTextAppearance(i2);
        Context context = textView.getContext();
        TypedValue typedValue = new TypedValue();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, j);
        ff2 ff2Var = ff2.e;
        typedArrayObtainStyledAttributes.getValue(0, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        if (typedValue.type == 5) {
            xih.s(textView, ff2.g(textView.getContext(), typedValue));
        }
    }

    public static int s(int i2, int i3) {
        return (i2 & 16777215) | (i3 << 24);
    }

    public static void s0(Context context, ekj ekjVar, int i2, int i3) {
        rxh rxhVar = new rxh(i3);
        z77 z77VarU = sfe.U(context);
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = ekjVar;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = null;
        gkjVar.i = null;
        gkjVar.j = null;
        gkjVar.k = 2132020155;
        gkjVar.l = 0;
        gkjVar.m = i2;
        gkjVar.n = true;
        gkjVar.o = rxhVar;
        z77VarU.getClass();
        z77VarU.b(gkjVar, ijm.b);
    }

    public static final f99 t(ekc ekcVar) {
        return ic4.l(f03.g(new p71((byte) 12, (mt5) null, ekcVar)), -1);
    }

    public static void t0(bq4 bq4Var) {
        bq4Var.t(3);
        bq4Var.t(8);
        boolean zH = bq4Var.h();
        boolean zH2 = bq4Var.h();
        if (zH) {
            bq4Var.t(5);
        }
        if (zH2) {
            bq4Var.t(6);
        }
    }

    public static hx5 u(f99 f99Var) {
        h hVar = h.a;
        fg6 fg6Var = new fg6((byte) 17, (mt5) null, f99Var);
        hx5 hx5Var = new hx5((byte) 0);
        hVar.getClass();
        csk cskVar = new csk((unb) null);
        cv6 cv6Var = bb7.a;
        d7a d7aVar = s6d.a.e;
        d7aVar.getClass();
        hx5Var.o = new igi(hx5Var, fg6Var, sgb.b(e.a(d7aVar, hVar).plus(cskVar)), new r94(hx5Var, (byte) 18));
        if (f99Var instanceof lak) {
            if (cx1.C().a.C()) {
                hx5Var.r(((lak) f99Var).getValue());
                return hx5Var;
            }
            hx5Var.n(((lak) f99Var).getValue());
        }
        return hx5Var;
    }

    public static void u0(bq4 bq4Var) {
        int i2;
        int i3;
        int i4 = bq4Var.i(2);
        int i5 = 6;
        if (i4 == 0) {
            bq4Var.t(6);
            return;
        }
        int i6 = 5;
        int iL0 = l0(bq4Var, 5, 8, 16) + 1;
        if (i4 == 1) {
            bq4Var.t(iL0 * 7);
            return;
        }
        if (i4 == 2) {
            if (bq4Var.h()) {
                i5 = 8;
                i2 = 1;
                i6 = 7;
            } else {
                i2 = 5;
            }
            int i7 = 0;
            while (i7 < iL0) {
                if (bq4Var.h()) {
                    bq4Var.t(7);
                    i3 = 0;
                } else {
                    if (bq4Var.i(2) == 3 && bq4Var.i(i6) * i2 != 0) {
                        bq4Var.s();
                    }
                    i3 = bq4Var.i(i5) * i2;
                    if (i3 != 0 && i3 != 180) {
                        bq4Var.s();
                    }
                    bq4Var.s();
                }
                if (i3 != 0 && i3 != 180 && bq4Var.h()) {
                    i7++;
                }
                i7++;
            }
        }
    }

    public static final Object v(ekc ekcVar, nt5 nt5Var) {
        return cs5.E(t(ekcVar), nt5Var);
    }

    public static final Object w(ekc ekcVar, Function2 function2, nt5 nt5Var) {
        return cs5.F(t(ekcVar), function2, nt5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final tsd y(ikc ikcVar, ikc ikcVar2, pde pdeVar, cr9 cr9Var) {
        return B(new wnm(cr9Var.invoke(ikcVar.g(), ikcVar2.g(), pdeVar.g()), Arrays.asList(ikcVar, ikcVar2, pdeVar), new fza((byte) 17), new i51((Object) cr9Var, (Object) ikcVar, (Object) ikcVar2, (Object) pdeVar, (byte) 11)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final tsd z(ikc ikcVar, pde pdeVar, Function2 function2) {
        return B(new wnm(function2.invoke(ikcVar.g(), pdeVar.g()), Arrays.asList(ikcVar, pdeVar), new fza((byte) 17), new hv(function2, ikcVar, pdeVar, (byte) 24)));
    }

    public abstract xf8 C(xf8 xf8Var);

    public boolean C0() {
        return D0().testBit(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(int r5, byte[] r6) {
        /*
            r4 = this;
            java.math.BigInteger r0 = r4.D0()
            int r4 = r4.I()
            java.math.BigInteger r1 = oe3.a
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            r2 = 0
            if (r1 != r4) goto L16
            java.lang.System.arraycopy(r0, r2, r6, r5, r4)
            return
        L16:
            r1 = r0[r2]
            if (r1 != 0) goto L1e
            int r1 = r0.length
            r3 = 1
            if (r1 != r3) goto L1f
        L1e:
            r3 = r2
        L1f:
            int r1 = r0.length
            int r1 = r1 - r3
            if (r1 > r4) goto L2c
            int r4 = r4 - r1
            int r4 = r4 + r5
            java.util.Arrays.fill(r6, r5, r4, r2)
            java.lang.System.arraycopy(r0, r3, r6, r4, r1)
            return
        L2c:
            java.lang.String r4 = "standard length exceeded for value"
            qp2.o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.D(int, byte[]):void");
    }

    public abstract BigInteger D0();

    public int I() {
        return (L() + 7) / 8;
    }

    public int L() {
        return 113;
    }

    public abstract xf8 R();

    public boolean T() {
        return x() == 1;
    }

    public boolean U() {
        return D0().signum() == 0;
    }

    public abstract xf8 b0(xf8 xf8Var);

    public xf8 c0(xf8 xf8Var, xf8 xf8Var2, xf8 xf8Var3) {
        return b0(xf8Var).z0(xf8Var2.b0(xf8Var3));
    }

    public xf8 d0(xf8 xf8Var, xf8 xf8Var2, xf8 xf8Var3) {
        return b0(xf8Var).p(xf8Var2.b0(xf8Var3));
    }

    public xf8 e0() {
        return this;
    }

    public abstract xf8 p(xf8 xf8Var);

    public abstract xf8 q();

    public final String toString() {
        switch (this.f) {
            case 17:
                return D0().toString(16);
            default:
                return super.toString();
        }
    }

    public abstract xf8 v0();

    public abstract xf8 w0();

    public int x() {
        return D0().bitLength();
    }

    public xf8 x0(xf8 xf8Var, xf8 xf8Var2) {
        return w0().p(xf8Var.b0(xf8Var2));
    }

    public xf8 y0(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this = this.w0();
        }
        return this;
    }

    public abstract xf8 z0(xf8 xf8Var);
}
