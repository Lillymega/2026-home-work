package company.vk.edu.distrib.compute.Lillymega;
import company.vk.edu.distrib.compute.Dao;

import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

public class LillymegaDao implements Dao<byte[]> {
    private final Map<String, byte[]> storage = new ConcurrentHashMap<>();

    @Override
    public byte[] get(String key) throws NoSuchElementException, IllegalArgumentException, IOException;

    @Override
    void upsert(String key, T value) throws IllegalArgumentException, IOException;

    @Override
    void delete(String key) throws IllegalArgumentException, IOException;
}