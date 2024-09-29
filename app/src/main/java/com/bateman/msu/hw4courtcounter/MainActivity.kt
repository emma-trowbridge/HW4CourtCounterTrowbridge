package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//communication between ScoreViewModel and MainActivity =

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: ScoreViewModel //connects ScoreViewModel class
    //var scoreTeamA = 0
    //var scoreTeamB = 0 ^canceled these out - replaced by viewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //puts viewModel into effect
        viewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)

        //updates UI with current viewModel data
        displayForTeamA(viewModel.scoreTeamA)
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        //scoreTeamA++
        //displayForTeamA(scoreTeamA)
        viewModel.scoreTeamA++
        displayForTeamA(viewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        //scoreTeamA += 2
        //displayForTeamA(scoreTeamA)
        viewModel.scoreTeamA += 2
        displayForTeamA(viewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        //scoreTeamA += 3
        //displayForTeamA(scoreTeamA)
        viewModel.scoreTeamA += 3
        displayForTeamA(viewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        //scoreTeamB++
        //displayForTeamB(scoreTeamB)
        viewModel.scoreTeamB++
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        //scoreTeamB += 2
        //displayForTeamB(scoreTeamB)
        viewModel.scoreTeamB += 2
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        //scoreTeamB += 3
        //displayForTeamB(scoreTeamB)
        viewModel.scoreTeamB += 3
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        viewModel.scoreTeamA = 0
        viewModel.scoreTeamB = 0
        displayForTeamA(viewModel.scoreTeamA)
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}