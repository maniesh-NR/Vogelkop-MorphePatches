package com.leanplum.internal;

import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ResourceQualifiers {
    public Map<Qualifier, Object> qualifiers = new HashMap();

    public enum Qualifier {
        MCC(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.1
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if (str.startsWith("mcc")) {
                    return Integer.getInteger(str.substring(3));
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.mcc == ((Integer) obj).intValue();
            }
        }),
        MNC(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.2
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if (str.startsWith("mnc")) {
                    return Integer.getInteger(str.substring(3));
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.mnc == ((Integer) obj).intValue();
            }
        }),
        LANGUAGE(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.3
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if (str.length() == 2) {
                    return str;
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.locale.getLanguage().equals(obj);
            }
        }),
        REGION(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.4
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if (str.startsWith("r") && str.length() == 3) {
                    return str.substring(1);
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.locale.getCountry().toLowerCase().equals(obj);
            }
        }),
        LAYOUT_DIRECTION(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.5
            public static final int SCREENLAYOUT_LAYOUTDIR_LTR = 64;
            public static final int SCREENLAYOUT_LAYOUTDIR_MASK = 192;
            public static final int SCREENLAYOUT_LAYOUTDIR_RTL = 128;

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                return "ldrtl".equals(str) ? Integer.valueOf(SCREENLAYOUT_LAYOUTDIR_RTL) : "ldltr".equals(str) ? 64 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return (configuration.screenLayout & SCREENLAYOUT_LAYOUTDIR_MASK) == ((Integer) obj).intValue();
            }
        }),
        SMALLEST_WIDTH(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.6
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Map<String, Object> bestMatch(Map<String, Object> map, Configuration configuration, DisplayMetrics displayMetrics) {
                HashMap map2 = new HashMap();
                int iIntValue = Integer.MIN_VALUE;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() > iIntValue) {
                        iIntValue = num.intValue();
                        map2.clear();
                    }
                    if (num.intValue() == iIntValue) {
                        map2.put(entry.getKey(), num);
                    }
                }
                return map2;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if (str.startsWith("sw") && str.endsWith("dp")) {
                    return Integer.getInteger(str.substring(2, str.length() - 2));
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                try {
                    return ((Integer) configuration.getClass().getField("smallestScreenWidthDp").get(configuration)).intValue() >= ((Integer) obj).intValue();
                } catch (Throwable th) {
                    Log.exception(th);
                    return false;
                }
            }
        }),
        AVAILABLE_WIDTH(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.7
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Map<String, Object> bestMatch(Map<String, Object> map, Configuration configuration, DisplayMetrics displayMetrics) {
                HashMap map2 = new HashMap();
                int iIntValue = Integer.MIN_VALUE;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() > iIntValue) {
                        iIntValue = num.intValue();
                        map2.clear();
                    }
                    if (num.intValue() == iIntValue) {
                        map2.put(entry.getKey(), num);
                    }
                }
                return map2;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if (str.startsWith("w") && str.endsWith("dp")) {
                    return Integer.getInteger(str.substring(1, str.length() - 2));
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                try {
                    return ((Integer) configuration.getClass().getField("screenWidthDp").get(configuration)).intValue() >= ((Integer) obj).intValue();
                } catch (Throwable th) {
                    Log.exception(th);
                    return false;
                }
            }
        }),
        AVAILABLE_HEIGHT(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.8
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Map<String, Object> bestMatch(Map<String, Object> map, Configuration configuration, DisplayMetrics displayMetrics) {
                HashMap map2 = new HashMap();
                int iIntValue = Integer.MIN_VALUE;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() > iIntValue) {
                        iIntValue = num.intValue();
                        map2.clear();
                    }
                    if (num.intValue() == iIntValue) {
                        map2.put(entry.getKey(), num);
                    }
                }
                return map2;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if (str.startsWith("h") && str.endsWith("dp")) {
                    return Integer.getInteger(str.substring(1, str.length() - 2));
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                try {
                    return ((Integer) configuration.getClass().getField("screenHeightDp").get(configuration)).intValue() >= ((Integer) obj).intValue();
                } catch (Throwable th) {
                    Log.exception(th);
                    return false;
                }
            }
        }),
        SCREEN_SIZE(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.9
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Map<String, Object> bestMatch(Map<String, Object> map, Configuration configuration, DisplayMetrics displayMetrics) {
                HashMap map2 = new HashMap();
                int iIntValue = Integer.MIN_VALUE;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() > iIntValue) {
                        iIntValue = num.intValue();
                        map2.clear();
                    }
                    if (num.intValue() == iIntValue) {
                        map2.put(entry.getKey(), num);
                    }
                }
                return map2;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("small".equals(str)) {
                    return 1;
                }
                if ("normal".equals(str)) {
                    return 2;
                }
                if ("large".equals(str)) {
                    return 3;
                }
                return "xlarge".equals(str) ? 4 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return (configuration.screenLayout & 15) <= ((Integer) obj).intValue();
            }
        }),
        SCREEN_ASPECT(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.10
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("long".equals(str)) {
                    return 32;
                }
                return "notlong".equals(str) ? 16 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return (configuration.screenLayout & 48) == ((Integer) obj).intValue();
            }
        }),
        SCREEN_ORIENTATION(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.11
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("port".equals(str)) {
                    return 1;
                }
                return "land".equals(str) ? 2 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.orientation == ((Integer) obj).intValue();
            }
        }),
        UI_MODE(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.12
            public static final int UI_MODE_TYPE_APPLIANCE = 5;
            public static final int UI_MODE_TYPE_TELEVISION = 4;

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("car".equals(str)) {
                    return 3;
                }
                if ("desk".equals(str)) {
                    return 2;
                }
                if ("television".equals(str)) {
                    return 4;
                }
                return "appliance".equals(str) ? 5 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return (configuration.uiMode & 15) == ((Integer) obj).intValue();
            }
        }),
        NIGHT_MODE(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.13
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("night".equals(str)) {
                    return 32;
                }
                return "notnight".equals(str) ? 16 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return (configuration.uiMode & 48) == ((Integer) obj).intValue();
            }
        }),
        SCREEN_PIXEL_DENSITY(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.14
            public static final int DENSITY_NONE = 0;
            public static final int DENSITY_TV = 213;
            public static final int DENSITY_XXHIGH = 480;

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Map<String, Object> bestMatch(Map<String, Object> map, Configuration configuration, DisplayMetrics displayMetrics) {
                HashMap map2 = new HashMap();
                int iIntValue = Integer.MAX_VALUE;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() < iIntValue && num.intValue() >= displayMetrics.densityDpi) {
                        iIntValue = num.intValue();
                        map2.clear();
                    }
                    if (num.intValue() == iIntValue) {
                        map2.put(entry.getKey(), num);
                    }
                }
                if (map2.size() == 0) {
                    int iIntValue2 = Integer.MIN_VALUE;
                    for (String str : map.keySet()) {
                        Integer num2 = (Integer) map.get(str);
                        if (num2.intValue() > iIntValue2) {
                            iIntValue2 = num2.intValue();
                            map2.clear();
                        }
                        if (num2.intValue() == iIntValue2) {
                            map2.put(str, num2);
                        }
                    }
                }
                return map2;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("ldpi".equals(str)) {
                    return 120;
                }
                if ("mdpi".equals(str)) {
                    return 160;
                }
                if ("hdpi".equals(str)) {
                    return 240;
                }
                if ("xhdpi".equals(str)) {
                    return 320;
                }
                if ("nodpi".equals(str)) {
                    return 0;
                }
                if ("tvdpi".equals(str)) {
                    return Integer.valueOf(DENSITY_TV);
                }
                if ("xxhigh".equals(str)) {
                    return Integer.valueOf(DENSITY_XXHIGH);
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return true;
            }
        }),
        TOUCHSCREEN_TYPE(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.15
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("notouch".equals(str)) {
                    return 1;
                }
                return "finger".equals(str) ? 3 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.touchscreen == ((Integer) obj).intValue();
            }
        }),
        KEYBOARD_AVAILABILITY(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.16
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("keysexposed".equals(str)) {
                    return 1;
                }
                if ("keyshidden".equals(str)) {
                    return 2;
                }
                return "keyssoft".equals(str) ? 0 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                Integer num = (Integer) obj;
                return num.intValue() == 0 || configuration.keyboardHidden == num.intValue();
            }
        }),
        PRIMARY_TEXT_INPUTMETHOD(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.17
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("nokeys".equals(str)) {
                    return 1;
                }
                if ("qwerty".equals(str)) {
                    return 2;
                }
                return "12key".equals(str) ? 3 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.keyboard == ((Integer) obj).intValue();
            }
        }),
        NAVIGATION_KEY_AVAILABILITY(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.18
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("navexposed".equals(str)) {
                    return 1;
                }
                return "navhidden".equals(str) ? 2 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.navigationHidden == ((Integer) obj).intValue();
            }
        }),
        PRIMARY_NON_TOUCH_NAVIGATION_METHOD(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.19
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if ("nonav".equals(str)) {
                    return 1;
                }
                if ("dpad".equals(str)) {
                    return 2;
                }
                if ("trackball".equals(str)) {
                    return 3;
                }
                return "wheel".equals(str) ? 4 : null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return configuration.navigation == ((Integer) obj).intValue();
            }
        }),
        PLATFORM_VERSION(new QualifierFilter() { // from class: com.leanplum.internal.ResourceQualifiers.Qualifier.20
            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public Object getMatch(String str) {
                if (str.startsWith("v")) {
                    return Integer.getInteger(str.substring(1));
                }
                return null;
            }

            @Override // com.leanplum.internal.ResourceQualifiers.QualifierFilter
            public boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics) {
                return Build.VERSION.SDK_INT >= ((Integer) obj).intValue();
            }
        });

        private QualifierFilter filter;

        Qualifier(QualifierFilter qualifierFilter) {
            this.filter = qualifierFilter;
        }

        public QualifierFilter getFilter() {
            return this.filter;
        }
    }

    public static abstract class QualifierFilter {
        public Map<String, Object> bestMatch(Map<String, Object> map, Configuration configuration, DisplayMetrics displayMetrics) {
            return map;
        }

        public abstract Object getMatch(String str);

        public abstract boolean isMatch(Object obj, Configuration configuration, DisplayMetrics displayMetrics);
    }

    public static ResourceQualifiers fromFolder(String str) {
        ResourceQualifiers resourceQualifiers = new ResourceQualifiers();
        int i = 0;
        for (String str2 : str.toLowerCase().split("-")) {
            boolean z = false;
            while (!z && i < Qualifier.values().length) {
                Qualifier qualifier = Qualifier.values()[i];
                Object match = qualifier.getFilter().getMatch(str2);
                if (match != null) {
                    resourceQualifiers.qualifiers.put(qualifier, match);
                    z = true;
                }
                i++;
            }
        }
        return resourceQualifiers;
    }
}
