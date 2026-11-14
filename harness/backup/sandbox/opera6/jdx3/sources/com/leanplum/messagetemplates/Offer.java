package com.leanplum.messagetemplates;

import defpackage.yjb;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010Ê\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/leanplum/messagetemplates/Offer;", "", "productId", "", "offerId", "expirationTime", "Ljava/util/Date;", "isPersonalized", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Z)V", "getProductId", "()Ljava/lang/String;", "getOfferId", "getExpirationTime", "()Ljava/util/Date;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app", "Landroidx/annotation/VisibleForTesting;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Offer {

    @NotNull
    private final Date expirationTime;
    private final boolean isPersonalized;

    @NotNull
    private final String offerId;

    @NotNull
    private final String productId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/leanplum/messagetemplates/Offer$Companion;", "", "<init>", "()V", "parse", "Lcom/leanplum/messagetemplates/Offer;", "offerMap", "", "", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Offer parse(@NotNull Map<String, String> offerMap) throws JSONException {
            try {
                return new Offer((String) rbd.b(offerMap, "Product ID"), (String) rbd.b(offerMap, "Offer ID"), yjb.a((String) rbd.b(offerMap, "Expiration Time")), Intrinsics.a(rbd.b(offerMap, "Is Personalized"), "true"));
            } catch (ParseException e) {
                throw new JSONException(e.getMessage());
            }
        }
    }

    public Offer(@NotNull String str, @NotNull String str2, @NotNull Date date, boolean z) {
        this.productId = str;
        this.offerId = str2;
        this.expirationTime = date;
        this.isPersonalized = z;
    }

    public static /* synthetic */ Offer copy$default(Offer offer, String str, String str2, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offer.productId;
        }
        if ((i & 2) != 0) {
            str2 = offer.offerId;
        }
        if ((i & 4) != 0) {
            date = offer.expirationTime;
        }
        if ((i & 8) != 0) {
            z = offer.isPersonalized;
        }
        return offer.copy(str, str2, date, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Date getExpirationTime() {
        return this.expirationTime;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPersonalized() {
        return this.isPersonalized;
    }

    @NotNull
    public final Offer copy(@NotNull String productId, @NotNull String offerId, @NotNull Date expirationTime, boolean isPersonalized) {
        return new Offer(productId, offerId, expirationTime, isPersonalized);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) other;
        return Intrinsics.a(this.productId, offer.productId) && Intrinsics.a(this.offerId, offer.offerId) && Intrinsics.a(this.expirationTime, offer.expirationTime) && this.isPersonalized == offer.isPersonalized;
    }

    @NotNull
    public final Date getExpirationTime() {
        return this.expirationTime;
    }

    @NotNull
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPersonalized) + ((this.expirationTime.hashCode() + z1m.f(this.productId.hashCode() * 31, 31, this.offerId)) * 31);
    }

    public final boolean isPersonalized() {
        return this.isPersonalized;
    }

    @NotNull
    public final String toString() {
        return "";
    }
}
