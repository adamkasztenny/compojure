(ns compojure.music.constants
  (:require [alda.lisp :refer :all])
  (:require [alda.now  :as now]))

(def noteLengths [1 2 4 8 16 32])

(def notes [
            (pitch :c)
            (pitch :d)
            (pitch :d :flat)
            (pitch :e)
            (pitch :e :flat)
            (pitch :f)
            (pitch :g)
            (pitch :g :flat)
            (pitch :a)
            (pitch :b)
            (pitch :b :flat)
          ])

(def instruments [  
                "midi-acoustic-grand-piano"
                "midi-bright-acoustic-piano"
                "midi-electric-grand-piano"
                "midi-honky-tonk-piano"
                "midi-electric-piano-1"
                "midi-electric-piano-2"
                "midi-harpsichord"
                "midi-clavi"

                "midi-celesta"
                "midi-glockenspiel"
                "midi-music-box"
                "midi-vibraphone"
                "midi-marimba"
                "midi-xylophone"
                "midi-tubular-bells"
                "midi-dulcimer"

                "midi-drawbar-organ"
                "midi-percussive-organ"
                "midi-rock-organ"
                "midi-church-organ"
                "midi-reed-organ"
                "midi-accordion"
                "midi-harmonica"
                "midi-tango-accordion"

                "midi-acoustic-guitar-nylon"
                "midi-acoustic-guitar-steel"
                "midi-electric-guitar-jazz"
                "midi-electric-guitar-clean"
                "midi-electric-guitar-palm-muted"
                "midi-electric-guitar-overdrive"
                "midi-electric-guitar-distorted"
                "midi-electric-guitar-harmonics"

                "midi-acoustic-bass"
                "midi-electric-bass-finger"
                "midi-electric-bass-pick"
                "midi-fretless-bass"
                "midi-bass-slap"
                "midi-bass-pop"
                "midi-synth-bass-1"
                "midi-synth-bass-2"

                "midi-violin"
                "midi-viola"
                "midi-cello"
                "midi-contrabass"
                "midi-tremolo-strings"
                "midi-pizzicato-strings"
                "midi-orchestral-harp"
                "midi-timpani"

                "midi-string-ensemble-1"
                "midi-string-ensemble-2"
                "midi-synth-strings-1"
                "midi-synth-strings-2"
                "midi-choir-aahs"
                "midi-voice-oohs"
                "midi-synth-voice"
                "midi-orchestra-hit"

                "midi-trumpet"
                "midi-trombone"
                "midi-tuba"
                "midi-muted-trumpet"
                "midi-french-horn"
                "midi-brass-section"
                "midi-synth-brass-1"
                "midi-synth-brass-2"

                "midi-soprano-saxophone"
                "midi-alto-saxophone"
                "midi-tenor-saxophone"
                "midi-baritone-saxophone"
                "midi-oboe"
                "midi-english-horn"
                "midi-bassoon"
                "midi-clarinet"

                "midi-piccolo"
                "midi-flute"
                "midi-recorder"
                "midi-pan-flute"
                "midi-bottle"
                "midi-shakuhachi"
                "midi-whistle"
                "midi-ocarina"

                "midi-square-lead"
                "midi-saw-wave"
                "midi-calliope-lead"
                "midi-chiffer-lead"
                "midi-charang"
                "midi-solo-vox"
                "midi-fifths"
                "midi-bass-and-lead"

                "midi-synth-pad-new-age"
                "midi-synth-pad-warm"
                "midi-synth-pad-polysynth"
                "midi-synth-pad-choir"
                "midi-synth-pad-bowed"
                "midi-synth-pad-metallic"
                "midi-synth-pad-halo"
                "midi-synth-pad-sweep"

                "midi-fx-rain"
                "midi-fx-soundtrack"
                "midi-fx-crystal"
                "midi-fx-atmosphere"
                "midi-fx-brightness"
                "midi-fx-goblins"
                "midi-fx-echoes"
                "midi-fx-sci-fi"

                "midi-sitar"
                "midi-banjo"
                "midi-shamisen"
                "midi-koto"
                "midi-kalimba"
                "midi-bagpipes"
                "midi-fiddle"
                "midi-shehnai"

                "midi-tinkle-bell"
                "midi-agogo"
                "midi-steel-drums"
                "midi-woodblock"
                "midi-taiko-drum"
                "midi-melodic-tom"
                "midi-synth-drum"
                "midi-reverse-cymbal"

                "midi-guitar-fret-noise"
                "midi-breath-noise"
                "midi-seashore"
                "midi-bird-tweet"
                "midi-telephone-ring"
                "midi-helicopter"
                "midi-applause"
                "midi-gunshot"
              ])