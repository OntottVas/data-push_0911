package hu.progmatic.datapush_0911.model;

import java.util.List;

public record User(String name, String gender, List<String> languages/*, String email*/) {}
