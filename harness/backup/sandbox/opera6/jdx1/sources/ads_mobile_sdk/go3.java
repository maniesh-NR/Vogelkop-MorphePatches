package ads_mobile_sdk;

import androidx.webkit.StartUpLocation;
import androidx.webkit.WebViewStartUpResult;
import defpackage.qjp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class go3 implements qjp {
    public final /* synthetic */ WebViewStartUpResult a;

    public go3(WebViewStartUpResult webViewStartUpResult) {
        this.a = webViewStartUpResult;
    }

    @Override // defpackage.qjp
    public final List a() {
        try {
            List<StartUpLocation> nonUiThreadBlockingStartUpLocations = this.a.getNonUiThreadBlockingStartUpLocations();
            if (nonUiThreadBlockingStartUpLocations != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = nonUiThreadBlockingStartUpLocations.iterator();
                while (it.hasNext()) {
                    String stackInformation = ((StartUpLocation) it.next()).getStackInformation();
                    if (stackInformation == null) {
                        stackInformation = null;
                    }
                    if (stackInformation != null) {
                        arrayList.add(stackInformation);
                    }
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // defpackage.qjp
    public final List b() {
        try {
            List<StartUpLocation> uiThreadBlockingStartUpLocations = this.a.getUiThreadBlockingStartUpLocations();
            if (uiThreadBlockingStartUpLocations != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = uiThreadBlockingStartUpLocations.iterator();
                while (it.hasNext()) {
                    String stackInformation = ((StartUpLocation) it.next()).getStackInformation();
                    if (stackInformation == null) {
                        stackInformation = null;
                    }
                    if (stackInformation != null) {
                        arrayList.add(stackInformation);
                    }
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // defpackage.qjp
    public final Long getMaxTimePerTaskInUiThreadMillis() {
        try {
            return this.a.getMaxTimePerTaskInUiThreadMillis();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.qjp
    public final Long getTotalTimeInUiThreadMillis() {
        try {
            return this.a.getTotalTimeInUiThreadMillis();
        } catch (Throwable unused) {
            return null;
        }
    }
}
