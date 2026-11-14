package com.leanplum.messagetemplates;

import com.leanplum.internal.Constants;
import defpackage.eg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/leanplum/messagetemplates/DiscardInfo;", "", "", Constants.Params.MESSAGE, "Leg0;", "reason", "<init>", "(Ljava/lang/String;Leg0;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()Leg0;", "copy", "(Ljava/lang/String;Leg0;)Lcom/leanplum/messagetemplates/DiscardInfo;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Leg0;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DiscardInfo {
    public static final int $stable = 0;
    public final String message;

    @NotNull
    public final eg0 reason;

    public DiscardInfo(String str, @NotNull eg0 eg0Var) {
        this.message = str;
        this.reason = eg0Var;
    }

    public static /* synthetic */ DiscardInfo copy$default(DiscardInfo discardInfo, String str, eg0 eg0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discardInfo.message;
        }
        if ((i & 2) != 0) {
            eg0Var = discardInfo.reason;
        }
        return discardInfo.copy(str, eg0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final eg0 getReason() {
        return this.reason;
    }

    @NotNull
    public final DiscardInfo copy(String message, @NotNull eg0 reason) {
        return new DiscardInfo(message, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscardInfo)) {
            return false;
        }
        DiscardInfo discardInfo = (DiscardInfo) other;
        return Intrinsics.a(this.message, discardInfo.message) && Intrinsics.a(this.reason, discardInfo.reason);
    }

    public int hashCode() {
        String str = this.message;
        return this.reason.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "";
    }
}
