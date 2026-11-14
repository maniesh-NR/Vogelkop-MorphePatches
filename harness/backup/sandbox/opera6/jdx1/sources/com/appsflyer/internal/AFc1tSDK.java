package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import defpackage.o95;
import defpackage.p3p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1tSDK implements AFc1vSDK {

    @NotNull
    private final AFc1iSDK AFAdRevenueData;

    @NotNull
    private final AFc1qSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1sSDK getMediationNetwork = new AFc1sSDK(Arrays.asList(new AFc1uSDK("ConversionsCache", Collections.singletonList(AFe1mSDK.CONVERSION), 1), new AFc1uSDK("AttrCache", Collections.singletonList(AFe1mSDK.ATTR), 1), new AFc1uSDK("OtherCache", Arrays.asList(AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.ADREVENUE, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.SDK_SERVICES), 40)));

    @NotNull
    private final Map<String, Integer> getRevenue = rbd.d(new Pair[]{new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0)});

    public AFc1tSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull AFc1qSDK aFc1qSDK) {
        this.AFAdRevenueData = aFc1iSDK;
        this.getCurrencyIso4217Code = aFc1qSDK;
    }

    private final AFc1uSDK getCurrencyIso4217Code(AFe1mSDK aFe1mSDK) {
        Object next;
        Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AFc1uSDK) next).getRevenue.contains(aFe1mSDK)) {
                break;
            }
        }
        return (AFc1uSDK) next;
    }

    private final boolean getCurrencyIso4217Code(File file) {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, sko.k("Could not delete ", file.getName(), " from cache"), e, false, false, false, false, 120, null);
            return false;
        }
    }

    private static AFc1rSDK getMediationNetwork(File file) throws IOException {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1rSDK aFc1rSDK = new AFc1rSDK(cArr);
                aFc1rSDK.getMediationNetwork = file.getName();
                inputStreamReader.close();
                return aFc1rSDK;
            } finally {
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e, false, false, true, false);
            return null;
        }
    }

    private final String getMediationNetwork(AFe1mSDK aFe1mSDK) {
        String str;
        AFc1uSDK currencyIso4217Code = getCurrencyIso4217Code(aFe1mSDK);
        if (currencyIso4217Code != null && (str = currencyIso4217Code.getCurrencyIso4217Code) != null) {
            return str;
        }
        yt7.k("Cache do not support this type of events");
        return null;
    }

    private final void getMonetizationNetwork() {
        for (AFc1uSDK aFc1uSDK : this.getMediationNetwork.AFAdRevenueData) {
            File file = new File(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"), aFc1uSDK.getCurrencyIso4217Code);
            if (file.exists()) {
                Map<String, Integer> map = this.getRevenue;
                String str = aFc1uSDK.getCurrencyIso4217Code;
                File[] fileArrListFiles = file.listFiles();
                map.put(str, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getRevenue.put(aFc1uSDK.getCurrencyIso4217Code, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final String AFAdRevenueData(@NotNull AFc1rSDK aFc1rSDK) throws IOException {
        Exception exc;
        File file;
        String str;
        List<File> listE0;
        try {
            File file2 = new File(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFc1rSDK.getMonetizationNetwork));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1rSDK.getRevenue, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1rSDK.AFAdRevenueData);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1rSDK.getRevenue);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1rSDK.getMediationNetwork(), 2));
                    outputStreamWriter.write(10);
                    AFe1mSDK aFe1mSDK = aFc1rSDK.getMonetizationNetwork;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1mSDK.name());
                    outputStreamWriter.write(10);
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                    AFe1mSDK aFe1mSDK2 = aFc1rSDK.getMonetizationNetwork;
                    AFc1uSDK currencyIso4217Code = getCurrencyIso4217Code(aFe1mSDK2);
                    Integer numValueOf = currencyIso4217Code != null ? Integer.valueOf(currencyIso4217Code.AFAdRevenueData) : null;
                    if (numValueOf == null) {
                        return strValueOf;
                    }
                    int iIntValue = numValueOf.intValue();
                    Map<String, Integer> map = this.getRevenue;
                    AFc1uSDK currencyIso4217Code2 = getCurrencyIso4217Code(aFe1mSDK2);
                    if (currencyIso4217Code2 == null || (str = currencyIso4217Code2.getCurrencyIso4217Code) == null) {
                        throw new UnsupportedOperationException("Cache do not support this type of events");
                    }
                    Integer num = map.get(str);
                    int iIntValue2 = num != null ? num.intValue() : 0;
                    if (iIntValue2 >= iIntValue) {
                        int i = (iIntValue2 + 1) - iIntValue;
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1mSDK2 + ", removing " + i + " item(s)", false, 4, null);
                        File file3 = new File(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"), getMediationNetwork(aFe1mSDK2));
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        Object[] objArrListFiles = file3.listFiles();
                        if (objArrListFiles != null) {
                            Comparator comparator = new Comparator() { // from class: com.appsflyer.internal.AFc1tSDK.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ad5.a(((File) t).getName(), ((File) t2).getName());
                                }
                            };
                            if (objArrListFiles.length != 0) {
                                objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
                                if (objArrListFiles.length > 1) {
                                    Arrays.sort(objArrListFiles, comparator);
                                }
                            }
                            List listAsList = Arrays.asList(objArrListFiles);
                            if (listAsList != null && (listE0 = CollectionsKt.e0(listAsList, i)) != null) {
                                for (File file4 : listE0) {
                                    file4.delete();
                                    AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                    }
                    getMonetizationNetwork();
                    return strValueOf;
                } finally {
                }
            } catch (Exception e) {
                exc = e;
                if (file != null) {
                    file.delete();
                }
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e2) {
            exc = e2;
            file = null;
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void AFAdRevenueData() {
        try {
            if (this.getCurrencyIso4217Code.AFAdRevenueData("AF_CACHE_VERSION", -1) != 1) {
                this.getCurrencyIso4217Code.getMediationNetwork("AF_CACHE_VERSION", 1);
                if (new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").exists()) {
                    z29.h(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"));
                    new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else if (!new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").exists()) {
                new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").mkdir();
            }
            getMonetizationNetwork();
        } catch (Exception e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final boolean AFAdRevenueData(String str) {
        if (str == null) {
            return false;
        }
        if (!new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").exists()) {
            new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, sko.k("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            File file = new File(new File(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"), ((AFc1uSDK) it.next()).getCurrencyIso4217Code), str);
            if (file.exists()) {
                return getCurrencyIso4217Code(file);
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void getMediationNetwork() {
        try {
            if (!new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").exists()) {
                new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
            while (it.hasNext()) {
                File[] fileArrListFiles = new File(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"), ((AFc1uSDK) it.next()).getCurrencyIso4217Code).listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            z29.h(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"));
            getMonetizationNetwork();
        } catch (Exception e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    @NotNull
    public final List<AFc1rSDK> getRevenue() {
        int i;
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            if (!new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").exists()) {
                new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getMediationNetwork.AFAdRevenueData.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                File file = new File(new File(this.AFAdRevenueData.getMonetizationNetwork.getFilesDir(), "AFRequestCache"), ((AFc1uSDK) it.next()).getCurrencyIso4217Code);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                o95.s(arrayList2, fileArrListFiles);
            }
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                File file2 = (File) obj;
                AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1rSDK mediationNetwork = getMediationNetwork(file2);
                if (mediationNetwork != null) {
                    arrayList.add(mediationNetwork);
                }
            }
        } catch (Exception e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e, false, false, false, false, 120, null);
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, p3p.i(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }
}
