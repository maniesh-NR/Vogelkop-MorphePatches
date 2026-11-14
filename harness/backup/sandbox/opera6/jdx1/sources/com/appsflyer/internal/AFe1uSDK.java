package com.appsflyer.internal;

import android.annotation.SuppressLint;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.AFe1tSDK;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFe1uSDK {

    @NotNull
    public final AFc1qSDK AFAdRevenueData;

    @NotNull
    private final AFe1lSDK component3;

    @NotNull
    private final AFf1gSDK component4;

    @NotNull
    private final AFg1qSDK getCurrencyIso4217Code;

    @NotNull
    private final ExecutorService getMediationNetwork;

    @NotNull
    private final AFc1pSDK getMonetizationNetwork;

    @NotNull
    public final AFc1iSDK getRevenue;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFe1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1uSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends ozb implements Function1<AFe1rSDK, Unit> {
        public static final AnonymousClass3 getRevenue = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        public final void getRevenue(@NotNull AFe1rSDK aFe1rSDK) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFe1rSDK) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFe1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1uSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends ozb implements Function1<AFe1rSDK, Unit> {
        public AnonymousClass4() {
            super(1);
        }

        public final void getRevenue(@NotNull AFe1rSDK aFe1rSDK) {
            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                AFe1uSDK.this.AFAdRevenueData.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", true);
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFe1rSDK) obj);
            return Unit.a;
        }
    }

    public AFe1uSDK(@NotNull AFc1qSDK aFc1qSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull ExecutorService executorService, @NotNull AFg1qSDK aFg1qSDK, @NotNull AFf1gSDK aFf1gSDK, @NotNull AFe1lSDK aFe1lSDK) {
        this.AFAdRevenueData = aFc1qSDK;
        this.getRevenue = aFc1iSDK;
        this.getMonetizationNetwork = aFc1pSDK;
        this.getMediationNetwork = executorService;
        this.getCurrencyIso4217Code = aFg1qSDK;
        this.component4 = aFf1gSDK;
        this.component3 = aFe1lSDK;
    }

    @SuppressLint({"NewApi"})
    public final void getMediationNetwork(@NotNull AFe1tSDK aFe1tSDK, @NotNull Function1<? super AFe1rSDK, Unit> function1) {
        AFf1zSDK aFf1zSDK = new AFf1zSDK(aFe1tSDK, this.getMediationNetwork, this.getMonetizationNetwork, this.getRevenue, this.getCurrencyIso4217Code, this.component4, function1);
        AFe1lSDK aFe1lSDK = this.component3;
        aFe1lSDK.getRevenue.execute(aFe1lSDK.new AnonymousClass5(aFf1zSDK));
    }

    @SuppressLint({"NewApi"})
    public final void getRevenue() {
        if (this.AFAdRevenueData.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1iSDK.getRevenue(this.getRevenue.getMonetizationNetwork)) {
            return;
        }
        getMediationNetwork(AFe1tSDK.AFa1uSDK.INSTANCE, new AnonymousClass4());
    }
}
