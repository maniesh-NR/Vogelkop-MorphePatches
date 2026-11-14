package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import j$.util.Collection;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class AFc1eSDK implements AFc1dSDK {
    private static final int getMediationNetwork = 30000;
    private AFe1zSDK AFInAppEventParameterName;
    private AFf1gSDK AFInAppEventType;
    private AFd1uSDK AFKeystoreWrapper;
    private AFc1vSDK AFLogger;
    private AFh1uSDK AFPurchaseDetails;
    private AFa1oSDK afDebugLog;
    private AFa1gSDK afErrorLog;
    private AFa1aSDK afInfoLog;
    private AFe1uSDK afLogForce;

    @Nullable
    private AFi1fSDK afRDLog;
    private AFf1dSDK afVerboseLog;
    private AFg1bSDK afWarnLog;
    private AFc1pSDK areAllFieldsValid;
    private PurchaseHandler component1;
    private AFc1jSDK component2;
    private AFf1oSDK component3;
    private AFd1lSDK component4;
    private AFg1qSDK copy;
    private AFh1vSDK copydefault;
    private AFj1fSDK d;
    private AFb1bSDK e;
    private AFd1pSDK equals;
    private AFg1vSDK force;
    private ExecutorService getCurrencyIso4217Code;
    private AFc1kSDK getLevel;
    private ScheduledExecutorService getMonetizationNetwork;
    private ExecutorService getRevenue;
    private AFj1lSDK hashCode;
    private AFg1uSDK i;
    private AFj1sSDK registerClient;
    private AFe1lSDK toString;
    private AFi1lSDK unregisterClient;
    private AFi1kSDK v;
    private AFg1xSDK values;
    private AFi1tSDK w;
    private String afErrorLogForExcManagerOnly = null;
    public final AFc1iSDK AFAdRevenueData = new AFc1iSDK();

    /* renamed from: com.appsflyer.internal.AFc1eSDK$3, reason: invalid class name */
    final class AnonymousClass3 extends LinkedBlockingQueue<Runnable> implements Collection {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public boolean offer(Runnable runnable) {
            if (isEmpty()) {
                return super.offer(runnable);
            }
            return false;
        }
    }

    static class AFa1ySDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getMonetizationNetwork = new AtomicInteger();

        public AFa1ySDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = getCurrencyIso4217Code.get();
            int iIncrementAndGet = this.getMonetizationNetwork.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(iIncrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    @NonNull
    private synchronized ExecutorService AFLoggerLogLevel() {
        ExecutorService executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor = this.getCurrencyIso4217Code;
        if (executorServiceNewSingleThreadExecutor == null) {
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            this.getCurrencyIso4217Code = executorServiceNewSingleThreadExecutor;
        }
        return executorServiceNewSingleThreadExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    /* renamed from: AFPurchaseDetails, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1uSDK afRDLog() {
        AFd1uSDK aFd1uSDK;
        aFd1uSDK = this.AFKeystoreWrapper;
        if (aFd1uSDK == null) {
            aFd1uSDK = new AFd1uSDK(this);
            this.AFKeystoreWrapper = aFd1uSDK;
        }
        return aFd1uSDK;
    }

    @NonNull
    private synchronized AFd1lSDK afLogForce() {
        AFd1lSDK aFd1lSDK;
        aFd1lSDK = this.component4;
        if (aFd1lSDK == null) {
            aFd1lSDK = new AFd1lSDK(new AFd1jSDK(getMediationNetwork), getMonetizationNetwork());
            this.component4 = aFd1lSDK;
        }
        return aFd1lSDK;
    }

    @NonNull
    private synchronized AFj1fSDK getLevel() {
        AFj1fSDK aFj1fSDK;
        aFj1fSDK = this.d;
        if (aFj1fSDK == null) {
            aFj1fSDK = new AFj1fSDK(getRevenue());
            this.d = aFj1fSDK;
        }
        return aFj1fSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) throws InterruptedException {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences m_() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context != null) {
            return AFa1tSDK.c_(context);
        }
        qp2.n("Context must be set via setContext method before calling this dependency.");
        return null;
    }

    @NonNull
    private String valueOf() {
        String str = this.afErrorLogForExcManagerOnly;
        if (str != null) {
            return str;
        }
        String monetizationNetwork = new AFa1vSDK().getMonetizationNetwork();
        this.afErrorLogForExcManagerOnly = monetizationNetwork;
        return monetizationNetwork;
    }

    @NonNull
    private synchronized AFg1xSDK values() {
        AFg1xSDK aFg1xSDK;
        aFg1xSDK = this.values;
        if (aFg1xSDK == null) {
            aFg1xSDK = new AFg1xSDK(AFInAppEventType(), getRevenue());
            this.values = aFg1xSDK;
        }
        return aFg1xSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized ScheduledExecutorService AFAdRevenueData() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool = this.getMonetizationNetwork;
        if (scheduledExecutorServiceNewScheduledThreadPool == null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            this.getMonetizationNetwork = scheduledExecutorServiceNewScheduledThreadPool;
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFc1vSDK AFInAppEventParameterName() {
        AFc1vSDK aFc1tSDK;
        aFc1tSDK = this.AFLogger;
        if (aFc1tSDK == null) {
            aFc1tSDK = new AFc1tSDK(AFInAppEventType(), component2());
            this.AFLogger = aFc1tSDK;
        }
        return aFc1tSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFc1iSDK AFInAppEventType() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFe1zSDK AFKeystoreWrapper() {
        AFe1zSDK aFe1zSDK;
        aFe1zSDK = this.AFInAppEventParameterName;
        if (aFe1zSDK == null) {
            aFe1zSDK = new AFe1zSDK(getRevenue(), component2());
            this.AFInAppEventParameterName = aFe1zSDK;
        }
        return aFe1zSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFj1sSDK AFLogger() {
        AFj1sSDK aFj1sSDK;
        aFj1sSDK = this.registerClient;
        if (aFj1sSDK == null) {
            aFj1sSDK = new AFj1sSDK(this);
            this.registerClient = aFj1sSDK;
        }
        return aFj1sSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFb1bSDK afDebugLog() {
        AFb1bSDK aFb1aSDK = this.e;
        if (aFb1aSDK == null) {
            ExecutorService executorServiceAFLoggerLogLevel = AFLoggerLogLevel();
            ScheduledExecutorService scheduledExecutorServiceAFAdRevenueData = AFAdRevenueData();
            AFa1oSDK aFa1oSDKD = d();
            AFi1kSDK aFi1oSDK = this.v;
            if (aFi1oSDK == null) {
                aFi1oSDK = new AFi1oSDK();
                this.v = aFi1oSDK;
            }
            aFb1aSDK = new AFb1aSDK(executorServiceAFLoggerLogLevel, scheduledExecutorServiceAFAdRevenueData, aFa1oSDKD, aFi1oSDK);
            this.e = aFb1aSDK;
        }
        return aFb1aSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFf1dSDK afErrorLog() {
        AFf1dSDK aFf1dSDK = this.afVerboseLog;
        if (aFf1dSDK != null) {
            return aFf1dSDK;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            qp2.n("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFf1bSDK aFf1bSDK = new AFf1bSDK(context, AppsFlyerProperties.getInstance());
        AFc1kSDK aFc1kSDK = this.getLevel;
        if (aFc1kSDK == null) {
            aFc1kSDK = new AFc1kSDK();
            this.getLevel = aFc1kSDK;
        }
        AFf1fSDK aFf1fSDK = new AFf1fSDK(aFf1bSDK, aFc1kSDK, AppsFlyerProperties.getInstance());
        this.afVerboseLog = aFf1fSDK;
        return aFf1fSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @Nullable
    public final AFh1uSDK afErrorLogForExcManagerOnly() {
        if (AFh1sSDK.getCurrencyIso4217Code() && this.AFPurchaseDetails == null) {
            this.AFPurchaseDetails = new AFh1pSDK(getRevenue(), AFLogger());
        }
        return this.AFPurchaseDetails;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFc1kSDK afInfoLog() {
        AFc1kSDK aFc1kSDK = this.getLevel;
        if (aFc1kSDK != null) {
            return aFc1kSDK;
        }
        AFc1kSDK aFc1kSDK2 = new AFc1kSDK();
        this.getLevel = aFc1kSDK2;
        return aFc1kSDK2;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFa1gSDK afVerboseLog() {
        AFa1gSDK aFa1gSDK = this.afErrorLog;
        if (aFa1gSDK != null) {
            return aFa1gSDK;
        }
        AFa1lSDK aFa1lSDK = new AFa1lSDK(component2());
        this.afErrorLog = aFa1lSDK;
        return aFa1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFb1hSDK afWarnLog() {
        AFc1kSDK aFc1kSDK = this.getLevel;
        if (aFc1kSDK == null) {
            aFc1kSDK = new AFc1kSDK();
            this.getLevel = aFc1kSDK;
        }
        return new AFb1cSDK(aFc1kSDK, AFInAppEventType(), registerClient());
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFh1vSDK areAllFieldsValid() {
        AFh1vSDK aFh1vSDK;
        aFh1vSDK = this.copydefault;
        if (aFh1vSDK == null) {
            aFh1vSDK = new AFh1vSDK(component2());
            this.copydefault = aFh1vSDK;
        }
        return aFh1vSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFf1oSDK component1() {
        AFf1oSDK aFf1oSDK;
        aFf1oSDK = this.component3;
        if (aFf1oSDK == null) {
            AFf1lSDK aFf1lSDK = new AFf1lSDK(component2());
            AFf1oSDK aFf1oSDK2 = new AFf1oSDK(new AFf1pSDK(), getRevenue(), registerClient(), aFf1lSDK, new AFd1oSDK(afLogForce(), getRevenue(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getLevel()), new AFf1iSDK(getRevenue(), aFf1lSDK), copydefault());
            this.component3 = aFf1oSDK2;
            aFf1oSDK = aFf1oSDK2;
        }
        return aFf1oSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFc1qSDK component2() {
        AFc1jSDK aFc1jSDK = this.component2;
        if (aFc1jSDK != null) {
            return aFc1jSDK;
        }
        AFc1jSDK aFc1jSDK2 = new AFc1jSDK(new AFc1hSDK(new f(this, (byte) 1)));
        this.component2 = aFc1jSDK2;
        return aFc1jSDK2;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFg1qSDK component3() {
        AFg1qSDK aFg1qSDK = this.copy;
        if (aFg1qSDK == null) {
            String strValueOf = valueOf();
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            aFg1qSDK = null;
            if (context != null) {
                AFi1lSDK aFi1mSDK = this.unregisterClient;
                if (aFi1mSDK == null) {
                    aFi1mSDK = new AFi1mSDK();
                    this.unregisterClient = aFi1mSDK;
                }
                AFg1uSDK aFg1sSDK = this.i;
                if (aFg1sSDK == null) {
                    aFg1sSDK = new AFg1sSDK();
                    this.i = aFg1sSDK;
                }
                AFj1lSDK aFj1nSDK = this.hashCode;
                if (aFj1nSDK == null) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    if (context2 == null) {
                        qp2.n("Context must be set via setContext method before calling this dependency.");
                        return null;
                    }
                    aFj1nSDK = new AFj1nSDK(context2, AFLoggerLogLevel());
                    this.hashCode = aFj1nSDK;
                }
                AFg1vSDK aFg1tSDK = this.force;
                if (aFg1tSDK == null) {
                    aFg1tSDK = new AFg1tSDK();
                    this.force = aFg1tSDK;
                }
                AFh1vSDK aFh1vSDKAreAllFieldsValid = areAllFieldsValid();
                AFi1lSDK aFi1lSDK = aFi1mSDK;
                AFg1uSDK aFg1uSDK = aFg1sSDK;
                AFj1lSDK aFj1lSDK = aFj1nSDK;
                AFg1vSDK aFg1vSDK = aFg1tSDK;
                AFc1qSDK aFc1qSDKComponent2 = component2();
                AFc1pSDK revenue = getRevenue();
                AFi1tSDK aFi1tSDK = this.w;
                if (aFi1tSDK == null) {
                    Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                    if (context3 == null) {
                        qp2.n("Context must be set via setContext method before calling this dependency.");
                        return null;
                    }
                    aFi1tSDK = new AFi1tSDK(context3);
                    this.w = aFi1tSDK;
                }
                AFi1tSDK aFi1tSDK2 = aFi1tSDK;
                AFf1gSDK aFf1gSDKRegisterClient = registerClient();
                AFc1iSDK aFc1iSDKAFInAppEventType = AFInAppEventType();
                AFg1xSDK aFg1xSDKValues = values();
                AFc1kSDK aFc1kSDK = this.getLevel;
                if (aFc1kSDK == null) {
                    aFc1kSDK = new AFc1kSDK();
                    this.getLevel = aFc1kSDK;
                }
                AFg1oSDK aFg1oSDK = new AFg1oSDK(strValueOf, context, aFi1lSDK, aFg1uSDK, aFj1lSDK, aFg1vSDK, aFh1vSDKAreAllFieldsValid, aFc1qSDKComponent2, revenue, aFi1tSDK2, aFf1gSDKRegisterClient, aFc1iSDKAFInAppEventType, aFg1xSDKValues, aFc1kSDK);
                this.copy = aFg1oSDK;
                return aFg1oSDK;
            }
            qp2.n("Context must be set via setContext method before calling this dependency.");
        }
        return aFg1qSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized PurchaseHandler component4() {
        PurchaseHandler purchaseHandler;
        purchaseHandler = this.component1;
        if (purchaseHandler == null) {
            purchaseHandler = new PurchaseHandler(this);
            this.component1 = purchaseHandler;
        }
        return purchaseHandler;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFd1pSDK copy() {
        AFd1pSDK aFd1kSDK;
        aFd1kSDK = this.equals;
        if (aFd1kSDK == null) {
            aFd1kSDK = new AFd1kSDK(this);
            this.equals = aFd1kSDK;
        }
        return aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFe1lSDK copydefault() {
        AFe1lSDK aFe1lSDK;
        aFe1lSDK = this.toString;
        if (aFe1lSDK == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new AnonymousClass3(), new AFa1ySDK());
            threadPoolExecutor.setRejectedExecutionHandler(new i());
            aFe1lSDK = new AFe1lSDK(threadPoolExecutor);
            this.toString = aFe1lSDK;
        }
        return aFe1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFa1oSDK d() {
        AFa1oSDK aFa1oSDK;
        aFa1oSDK = this.afDebugLog;
        if (aFa1oSDK == null) {
            aFa1oSDK = new AFa1oSDK(this);
            this.afDebugLog = aFa1oSDK;
        }
        return aFa1oSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFa1aSDK e() {
        AFa1aSDK aFa1bSDK;
        aFa1bSDK = this.afInfoLog;
        if (aFa1bSDK == null) {
            aFa1bSDK = new AFa1bSDK(AFInAppEventType());
            this.afInfoLog = aFa1bSDK;
        }
        return aFa1bSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFj1lSDK equals() {
        AFj1lSDK aFj1lSDK = this.hashCode;
        if (aFj1lSDK != null) {
            return aFj1lSDK;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            qp2.n("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFj1nSDK aFj1nSDK = new AFj1nSDK(context, AFLoggerLogLevel());
        this.hashCode = aFj1nSDK;
        return aFj1nSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @Nullable
    public final AFi1fSDK force() {
        try {
            if (this.afRDLog == null) {
                try {
                    Object[] objArr = {getRevenue(), AFInAppEventType(), registerClient()};
                    Map map = AFi1jSDK.e;
                    Object declaredConstructor = map.get(-9506129);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1jSDK.AFAdRevenueData(0, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(AFc1pSDK.class, AFc1iSDK.class, AFf1gSDK.class);
                        map.put(-9506129, declaredConstructor);
                    }
                    this.afRDLog = (AFi1fSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFd1oSDK getCurrencyIso4217Code() {
        return new AFd1oSDK(afLogForce(), getRevenue(), AppsFlyerProperties.getInstance(), AFKeystoreWrapper(), getLevel());
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() {
        AFe1uSDK aFe1uSDK = this.afLogForce;
        if (aFe1uSDK != null) {
            return aFe1uSDK;
        }
        AFe1uSDK aFe1uSDK2 = new AFe1uSDK(component2(), AFInAppEventType(), getRevenue(), getMonetizationNetwork(), component3(), registerClient(), copydefault());
        this.afLogForce = aFe1uSDK2;
        return aFe1uSDK2;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized ExecutorService getMonetizationNetwork() {
        if (this.getRevenue == null) {
            this.getRevenue = new AFc1oSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        }
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFc1pSDK getRevenue() {
        AFc1pSDK aFc1pSDK;
        aFc1pSDK = this.areAllFieldsValid;
        if (aFc1pSDK == null) {
            AFc1iSDK aFc1iSDKAFInAppEventType = AFInAppEventType();
            AFc1qSDK aFc1qSDKComponent2 = component2();
            AFc1kSDK aFc1kSDK = this.getLevel;
            if (aFc1kSDK == null) {
                aFc1kSDK = new AFc1kSDK();
                this.getLevel = aFc1kSDK;
            }
            aFc1pSDK = new AFc1pSDK(aFc1iSDKAFInAppEventType, aFc1qSDKComponent2, aFc1kSDK, getMonetizationNetwork());
            this.areAllFieldsValid = aFc1pSDK;
        }
        return aFc1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFi1tSDK i() {
        AFi1tSDK aFi1tSDK = this.w;
        if (aFi1tSDK != null) {
            return aFi1tSDK;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            qp2.n("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFi1tSDK aFi1tSDK2 = new AFi1tSDK(context);
        this.w = aFi1tSDK2;
        return aFi1tSDK2;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final synchronized AFf1gSDK registerClient() {
        AFf1gSDK aFf1gSDK;
        aFf1gSDK = this.AFInAppEventType;
        if (aFf1gSDK == null) {
            aFf1gSDK = new AFf1gSDK(AFInAppEventType(), new AFf1eSDK());
            this.AFInAppEventType = aFf1gSDK;
        }
        return aFf1gSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFi1lSDK unregisterClient() {
        AFi1lSDK aFi1lSDK = this.unregisterClient;
        if (aFi1lSDK != null) {
            return aFi1lSDK;
        }
        AFi1mSDK aFi1mSDK = new AFi1mSDK();
        this.unregisterClient = aFi1mSDK;
        return aFi1mSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFg1bSDK v() {
        AFg1bSDK aFg1bSDK = this.afWarnLog;
        if (aFg1bSDK != null) {
            return aFg1bSDK;
        }
        AFg1aSDK aFg1aSDK = new AFg1aSDK(this);
        this.afWarnLog = aFg1aSDK;
        return aFg1aSDK;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NonNull
    public final AFi1kSDK w() {
        AFi1kSDK aFi1kSDK = this.v;
        if (aFi1kSDK != null) {
            return aFi1kSDK;
        }
        AFi1oSDK aFi1oSDK = new AFi1oSDK();
        this.v = aFi1oSDK;
        return aFi1oSDK;
    }
}
