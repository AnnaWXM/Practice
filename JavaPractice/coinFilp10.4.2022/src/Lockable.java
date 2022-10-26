public interface Lockable {
    public void setKey();
    public void lock();
    public void unlock();
    public boolean locked(int key);
}