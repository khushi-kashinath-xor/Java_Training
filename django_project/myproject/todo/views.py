from django.shortcuts import render, redirect
from .models import Task
from .forms import TaskForm  # import the form

def home(request):
    tasks = Task.objects.all()  # get all tasks
    print(tasks)
    form = TaskForm()  # create a blank form

    if request.method == "POST":
        form = TaskForm(request.POST)  # get data from the submitted form
        if form.is_valid():  # check if data is valid
            form.save()  # save to database
            return redirect('/')  # reload the page to show new task

    return render(request, 'home.html', {'tasks': tasks, 'form': form})