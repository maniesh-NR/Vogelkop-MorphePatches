package defpackage;

import com.opera.android.browser.NavigationEntry;

/* loaded from: classes.dex */
public final class gke implements NavigationEntry {
    public final /* synthetic */ byte a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final byte[] g;
    public final byte[] h;

    public /* synthetic */ gke(int i, String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte b) {
        this.a = b;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = bArr;
        this.h = bArr2;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean a() {
        switch (this.a) {
        }
        return this.f;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean b() {
        byte b = this.a;
        return true;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] c() {
        switch (this.a) {
        }
        return this.g;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String d() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] e() {
        switch (this.a) {
        }
        return this.h;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final int getId() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getTitle() {
        switch (this.a) {
        }
        return this.e;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getUrl() {
        switch (this.a) {
        }
        return this.c;
    }
}
