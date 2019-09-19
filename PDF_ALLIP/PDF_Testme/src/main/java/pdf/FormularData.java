// 
// Decompiled by Procyon v0.5.36
// 

package pdf;

public abstract class FormularData
{
    private String sourceFileName;
    
    public final String getSourceFileName() {
        return this.sourceFileName;
    }
    
    public final void setSourceFileName(String lSourceFileName) {
        if (lSourceFileName != null) {
            lSourceFileName = lSourceFileName.replace(";", ",");
        }
        this.sourceFileName = lSourceFileName;
    }
    
    public abstract boolean check();
    
    public abstract String toCSVString();
}
