package com.usercentrics.sdk;

import defpackage.h1a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/usercentrics/sdk/UsercentricsConsentUserResponse;", "", "userInteraction", "Lcom/usercentrics/sdk/UsercentricsUserInteraction;", "consents", "", "Lcom/usercentrics/sdk/UsercentricsServiceConsent;", "controllerId", "", "(Lcom/usercentrics/sdk/UsercentricsUserInteraction;Ljava/util/List;Ljava/lang/String;)V", "getConsents", "()Ljava/util/List;", "getControllerId", "()Ljava/lang/String;", "getUserInteraction", "()Lcom/usercentrics/sdk/UsercentricsUserInteraction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "usercentrics-ui_release"}, k = 1, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UsercentricsConsentUserResponse {

    @NotNull
    private final List<UsercentricsServiceConsent> consents;

    @NotNull
    private final String controllerId;

    @NotNull
    private final UsercentricsUserInteraction userInteraction;

    public UsercentricsConsentUserResponse(@NotNull UsercentricsUserInteraction usercentricsUserInteraction, @NotNull List<UsercentricsServiceConsent> list, @NotNull String str) {
        this.userInteraction = usercentricsUserInteraction;
        this.consents = list;
        this.controllerId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsercentricsConsentUserResponse copy$default(UsercentricsConsentUserResponse usercentricsConsentUserResponse, UsercentricsUserInteraction usercentricsUserInteraction, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            usercentricsUserInteraction = usercentricsConsentUserResponse.userInteraction;
        }
        if ((i & 2) != 0) {
            list = usercentricsConsentUserResponse.consents;
        }
        if ((i & 4) != 0) {
            str = usercentricsConsentUserResponse.controllerId;
        }
        return usercentricsConsentUserResponse.copy(usercentricsUserInteraction, list, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UsercentricsUserInteraction getUserInteraction() {
        return this.userInteraction;
    }

    @NotNull
    public final List<UsercentricsServiceConsent> component2() {
        return this.consents;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getControllerId() {
        return this.controllerId;
    }

    @NotNull
    public final UsercentricsConsentUserResponse copy(@NotNull UsercentricsUserInteraction userInteraction, @NotNull List<UsercentricsServiceConsent> consents, @NotNull String controllerId) {
        return new UsercentricsConsentUserResponse(userInteraction, consents, controllerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsercentricsConsentUserResponse)) {
            return false;
        }
        UsercentricsConsentUserResponse usercentricsConsentUserResponse = (UsercentricsConsentUserResponse) other;
        return this.userInteraction == usercentricsConsentUserResponse.userInteraction && Intrinsics.a(this.consents, usercentricsConsentUserResponse.consents) && Intrinsics.a(this.controllerId, usercentricsConsentUserResponse.controllerId);
    }

    @NotNull
    public final List<UsercentricsServiceConsent> getConsents() {
        return this.consents;
    }

    @NotNull
    public final String getControllerId() {
        return this.controllerId;
    }

    @NotNull
    public final UsercentricsUserInteraction getUserInteraction() {
        return this.userInteraction;
    }

    public int hashCode() {
        return this.controllerId.hashCode() + rfp.f(this.userInteraction.hashCode() * 31, 31, this.consents);
    }

    @NotNull
    public String toString() {
        UsercentricsUserInteraction usercentricsUserInteraction = this.userInteraction;
        List<UsercentricsServiceConsent> list = this.consents;
        String str = this.controllerId;
        StringBuilder sb = new StringBuilder("UsercentricsConsentUserResponse(userInteraction=");
        sb.append(usercentricsUserInteraction);
        sb.append(", consents=");
        sb.append(list);
        sb.append(", controllerId=");
        return z1m.l(sb, str, ")");
    }
}
