package androidx.webkit;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import defpackage.d56;
import defpackage.gtf;
import defpackage.kyj;
import defpackage.lyj;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface Profile {
    default void addCustomHeader(d56 d56Var) {
    }

    default void addQuicHints(Set<String> set) {
        throw new UnsupportedOperationException("Profile#addQuicHints is not implemented.");
    }

    default void clearAllCustomHeaders() {
    }

    void clearAllOriginMatchedHeaders();

    default void clearCustomHeader(String str) {
    }

    default void clearCustomHeader(String str, String str2) {
    }

    void clearOriginMatchedHeader(String str);

    void clearPrefetchAsync(String str, Executor executor, gtf gtfVar);

    CookieManager getCookieManager();

    default Set<d56> getCustomHeaders() {
        return Collections.EMPTY_SET;
    }

    default Set<d56> getCustomHeaders(String str) {
        return Collections.EMPTY_SET;
    }

    default Set<d56> getCustomHeaders(String str, String str2) {
        return Collections.EMPTY_SET;
    }

    GeolocationPermissions getGeolocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    default boolean hasCustomHeader(String str) {
        return false;
    }

    boolean hasOriginMatchedHeader(String str);

    default void preconnect(String str) {
        throw new UnsupportedOperationException("Profile#preconnect is not implemented.");
    }

    void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, gtf gtfVar);

    void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, lyj lyjVar, gtf gtfVar);

    void setOriginMatchedHeader(String str, String str2, Set<String> set);

    void setSpeculativeLoadingConfig(kyj kyjVar);

    void warmUpRendererProcess();
}
