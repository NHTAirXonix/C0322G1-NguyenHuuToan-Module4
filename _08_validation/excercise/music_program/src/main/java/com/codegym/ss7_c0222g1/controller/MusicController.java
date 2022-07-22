package com.codegym.ss7_c0222g1.controller;


import com.codegym.ss7_c0222g1.dto.MusicDto;
import com.codegym.ss7_c0222g1.model.Music;
import com.codegym.ss7_c0222g1.service.MusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("/list")
    public String showMusicList(Model model) {
        List<Music> musicList = musicService.findAll();
        model.addAttribute("music", new Music());
        model.addAttribute("musicList", musicList);
        return "music_list";
    }

    @GetMapping("/create")
    public String showFormAddNewMusic(Model model) {
        model.addAttribute("musicDto", new MusicDto());
        return "music_add_new";
    }

    @PostMapping("/create")
    public String addNewMusic(@Valid @ModelAttribute("musicDto") MusicDto musicDto, BindingResult result) {
        if (result.hasErrors()) {
            return "music_add_new";
        } else {
            Music music = new Music();
            BeanUtils.copyProperties(musicDto,music);
            musicService.save(music);
            return "redirect:/list";
        }
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Music music = musicService.findById(id);
        MusicDto musicDto = new MusicDto();
        BeanUtils.copyProperties(music,musicDto);
        model.addAttribute("musicDto", musicDto);
        return "/music_edit";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("musicDto") MusicDto musicDto, BindingResult result) {
        if (result.hasErrors()) {
            return "music_edit";
        } else {
            Music music = new Music();
            BeanUtils.copyProperties(musicDto,music);
            musicService.save(music);
            return "redirect:/list";
        }
    }
}
