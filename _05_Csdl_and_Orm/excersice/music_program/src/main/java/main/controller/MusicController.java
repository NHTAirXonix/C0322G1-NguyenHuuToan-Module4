package main.controller;

import main.model.Music;
import main.service.impl.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
        Music newMusic = new Music();
        model.addAttribute("newMusic", newMusic);
        return "music_add_new";
    }

    @PostMapping("/create")
    public String addNewMusic(Music music) {
        musicService.save(music);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("musicEdit", musicService.findById(id));
        return "/music_edit";
    }

    @PostMapping("/update")
    public String update(Music musicEdit) {
        musicService.update(musicEdit.getId(), musicEdit);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("musicDelete", musicService.findById(id));
        return "/music_delete";
    }

    @PostMapping("/delete")
    public String delete(Music musicDelete, Model model) {
        musicService.remove(musicDelete);
        List<Music> musicList = musicService.findAll();
        model.addAttribute("musicList", musicList);
        return "redirect:/list";
    }

    @GetMapping("/search")
    public String search(Music music, Model model) {
        model.addAttribute("music", new Music());
        model.addAttribute("musicList", musicService.searchByName(music));
        return "music_list";
    }


}
